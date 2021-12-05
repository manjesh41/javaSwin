package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HidePassword extends JFrame implements ActionListener {
    JPasswordField first;
    JLabel P;
    JCheckBox show;
    JButton cal;
    JPanel left;

    public HidePassword(){
        setTitle("Show password");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setSize(400, 200);

        //Label for length
        P = new JLabel();
        P.setText("Password :");
        P.setBounds(10,50,80,40);
        P.setForeground(Color.white);
        add(P);


        //Password for password;
        first = new JPasswordField();
        first.setBounds(130,50,200,40);
        first.setBackground(Color.lightGray);
        first.setForeground(Color.black);
        first.setBorder(null);
        add(first);



        show = new JCheckBox();
        show.setText("Show Password");
        show.setBounds(130,100,150,30);
        show.setForeground(Color.WHITE);
        show.setBackground(new Color(34, 40, 49));
        add(show);

        JPanel left = new JPanel();
        left.setBackground(new Color(34, 40, 49));
        left.setBounds(0,0,400,200);
        left.setLayout(null);
        add(left);

        show.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (show.isSelected()){
            first.setEchoChar((char)0);
        }else{
            first.setEchoChar('*');
        }

    }
    public static void main(String[] args) {
        new HidePassword().setVisible(true);
        HidePassword hidePassword = new HidePassword();
    }
}