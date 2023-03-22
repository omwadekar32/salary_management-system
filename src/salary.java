import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JRadioButton;

public class salary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salary frame = new salary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JTextField First;
	private JTextField Middle;
	private JTextField Last;
	private JTextField Da;
	private JTextField Amt;

	
	
	
	
	public salary() {
		ini();
		Connect();
	}
	
	
	//database
	
	
	Connection con;
	PreparedStatement pat;
	private JTable table;
	private JTable table_1;
	private JTextField De;
	
	
	
	
	public void Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3308/om","root","omwadekar");
			
		}
		catch (ClassNotFoundException ex)
		{
		}
		catch (SQLException ex)
		{
			
		}
	}
	
	
	

	/**
	 * Create the frame.
	 */
	public void  ini() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 22, 517, 342);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		tabbedPane.addTab("Add salary", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(80, 54, 66, 14);
		panel_1.add(lblNewLabel_2);
		
		Choice Emp = new Choice();
		
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/om","root","omwadekar");
						
				
				Statement st=con.createStatement();
				
				String sq="SELECT * FROM employee";
				
				ResultSet rs=st.executeQuery(sq);
				while(rs.next()) {
				
					String Last=rs.getString("Last");
					Emp.addItem(Last);
					System.out.println(Last);
					
				}
				
				
				}
				catch(Exception e1) {
					System.out.println("NOT");
				}
			
		Emp.setBounds(183, 48, 145, 20);
		panel_1.add(Emp);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2_1.setBounds(90, 79, 66, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Amount");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2_2.setBounds(80, 104, 66, 14);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton_1 = new JButton("Pay");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a=Emp.getSelectedItem();
				String b=Da.getText();
				String c=Amt.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/om","root","omwadekar");
					
					
					
					Statement ste = con.createStatement();
					
					String sqe = "SELECT * FROM employee WHERE Last='"+a+"';";
					//System.out.print(sqe);
					ResultSet r =ste.executeQuery(sqe);
					//System.out.println("here");
					
					while(r.next())
					{
					
					String i=String.valueOf(r.getInt("Id"));
					System.out.println(i);
				    Statement st = con.createStatement();
				    String sql = "insert into salary values('"+i+"','"+a+"',"+c+",'"+b+"');";
				    System.out.println(sql);
				    st.executeUpdate(sql);
				    System.out.println("Inserted");
					}
				}catch(Exception ex) {
					System.out.println("NOT done "+ex);
				}
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(166, 166, 89, 23);
		panel_1.add(btnNewButton_1);
		
		Da = new JTextField();
		Da.setBounds(183, 74, 145, 20);
		panel_1.add(Da);
		Da.setColumns(10);
		
		Amt = new JTextField();
		Amt.setColumns(10);
		Amt.setBounds(183, 102, 145, 20);
		panel_1.add(Amt);
		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		tabbedPane.addTab("Add Employee", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(82, 55, 69, 24);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last name");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(82, 118, 57, 24);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Middle name");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1_1_1.setBounds(82, 86, 89, 24);
		panel_3.add(lblNewLabel_1_1_1);
		
		First = new JTextField();
		First.setBounds(207, 57, 182, 20);
		panel_3.add(First);
		First.setColumns(10);
		
		Middle = new JTextField();
		Middle.setColumns(10);
		Middle.setBounds(207, 88, 182, 20);
		panel_3.add(Middle);
		
		Last = new JTextField();
		Last.setColumns(10);
		Last.setBounds(207, 120, 182, 20);
		panel_3.add(Last);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a=First.getText();
				String b=Middle.getText();
				String c=Last.getText();
				
				try {
					/*PreparedStatement p=con.prepareStatement("insert into employee(First Name,Middle Name,Last Name,Id)values(?,?,?,?)");
					System.out.print(a+ " "+b+" "+c+ " ");
					p.setString(1, a);
					p.setString(1, b);
					p.setString(1, c);
					p.setString(1,"NULL");
					*/
				    Statement st = con.createStatement();
				    String sql = "insert into employee values('"+a+"','"+b+"','"+c+"',NULL);";
				    System.out.println(sql);
				    st.executeUpdate(sql);
				    System.out.println("Inserted");
				}catch(Exception ex) {
					System.out.print(ex);
				}
				
				
			}
		});
		btnNewButton.setBounds(106, 240, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(257, 240, 89, 23);
		panel_3.add(btnCancel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 255));
		tabbedPane.addTab("Employee List", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(48, 53, 434, 128);
		panel_4.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		//table.setModel(model);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Id", "First", "Middle", "Last"
			}
		));
		
		JButton btnNewButton_2 = new JButton("Show");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/om","root","omwadekar");
					
					Statement st=con.createStatement();
					
					String sq="SELECT * FROM employee";
					ResultSet rs=st.executeQuery(sq);
					
					
					while(rs.next()) {
						
						String id=String.valueOf(rs.getInt("Id"));
						
						String First=rs.getString("First");

						String Middle=rs.getString("Middle");

						String Last=rs.getString("Last");
						
						//creating array
						
						String tbData[]= {id,First,Middle,Last};
						String td[] = {"1","xy","yz","ug"};
						
						DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
					
						tbmodel.addRow(tbData);
					}
				
				
				con.close();
				}
				catch(Exception ee) {
					System.out.println("Table not connect"+ee);
				}
			}
		});
		
		
			
		
		btnNewButton_2.setBounds(184, 232, 125, 36);
		panel_4.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(481, 182, -431, -131);
		panel_4.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		tabbedPane.addTab("Salary List", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Show");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/om","root","omwadekar");
						
					Statement st=con.createStatement();
				
				String sq="SELECT * FROM salary";
				ResultSet rs=st.executeQuery(sq);
				
				
				while(rs.next()) {
					
					
					String id=String.valueOf(rs.getInt("Id"));
					
					String Name=rs.getString("name");
					System.out.println(Name);
					String Amount=String.valueOf(rs.getInt("Amount"));
					System.out.println(Amount);
					String Date1=rs.getString("Date");
					System.out.println(Date1);
					
					
					
					//creating array
					
					String tbData[]= {id,Date1,Name,Amount};
					String td[] = {"1","xy","yz","ug"};
					
					DefaultTableModel tbmodel=(DefaultTableModel)table_1.getModel();
				
					tbmodel.addRow(tbData);
				}
			
			
			con.close();
			}
			catch(Exception ee) {
				System.out.println("Table not connect 2 "+ ee);
			}

				
			}
		});
		btnNewButton_3.setBounds(202, 246, 89, 23);
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(28, 25, 460, 169);
		panel.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Id", "Date", "Employee", "Amount"
			}
		));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		tabbedPane.addTab("Delete Employee", null, panel_2, null);
		panel_2.setLayout(null);
		
		De = new JTextField();
		De.setBounds(201, 75, 86, 20);
		panel_2.add(De);
		De.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Employee Id");
		lblNewLabel.setBounds(105, 75, 86, 20);
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String del=De.getText();
				
				
				try {
					
				    Statement st = con.createStatement();
				    String sql = " DELETE FROM employee where Id="+del+";";
				    System.out.println(sql);
				    st.executeUpdate(sql);
				    System.out.println("Deleted");
				}catch(Exception ex) {
					System.out.print(ex);
				}
				
			}
		});
		btnNewButton_4.setBounds(182, 149, 89, 23);
		panel_2.add(btnNewButton_4);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}
