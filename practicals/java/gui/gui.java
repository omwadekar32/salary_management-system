import java.awt.*;
import java.awt.event.*;

public class gui implements ActionListener {
    Button btn;

    public gui() {
        Frame f = new Frame();
        btn = new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        btn.addActionListener(this);
        f.add(btn); // adding a new Button.
        f.setSize(300, 250); // setting size.
        f.setTitle("JavaTPoint"); // setting title.
        f.setLayout(null); // set default layout for frame.
        f.setVisible(true); // set frame visibility true.
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            System.out.println("Button clicked!"); // perform some action when the button is clicked
        }
    }

    public static void main(String[] args) {
        gui awt = new gui(); // creating a frame.
    }
}
