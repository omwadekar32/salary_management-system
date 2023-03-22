import java.awt.EventQueue;
import javax.swing.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class n {

	private JFrame frame;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					n win = new n();
					win.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public n() {
		initialize();
	}

	
	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 520, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(104, 84, 67, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(104, 118, 67, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					String u=user.getText();
					//String p=password.getText();
					String p=new String(password.getPassword());
					
					
					if(u.equals("admin")&&p.equals("omwadekar")) {
						
						JOptionPane.showMessageDialog(null,"login succesful"); 
				
						
						salary Jf2=new salary();
						//Jf2.show();
						Jf2.setVisible(true);
					   
					
					
					}
					else {
						JOptionPane.showMessageDialog(null,"invalid login");
					}
				}
		});
		btnNewButton.setBounds(104, 198, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user.setText(null);
				password.setText(null);
				
				
			}
		});
		btnNewButton_1.setBounds(245, 198, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		user = new JTextField();
		user.setBounds(222, 85, 86, 20);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		password = new JPasswordField();
		
		password.setBounds(222, 120, 89, 23);
		frame.getContentPane().add(password);
	}
}
