package swing;
import javax.swing.*;
import java.awt.*;
public class LogIn extends JFrame{
    JLabel lbl;
    JTextField lb2;
    JLabel pw;
    JTextField pw2;
    JButton btn;

    public LogIn(){

        setLayout(null);
        lbl=new JLabel("Username");
        lbl.setBounds(90,50,150,30);



    }

    public static void main(String[] args) {
        new LogIn().setVisible(true);
    }
}

