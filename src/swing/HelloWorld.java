package swing;

import javax.swing.*;
import java.awt.*;
public class HelloWorld extends JFrame {
    JLabel labelHello;

    public HelloWorld(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setResizable(false);

        //forWelcome
        labelHello=new JLabel("Hello World");

        labelHello.setForeground(Color.red);
        labelHello.setFont(new Font("Arial",Font.BOLD,20));
        labelHello.setBounds(0,0,100,25);
        add(labelHello);
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);




    }
}
