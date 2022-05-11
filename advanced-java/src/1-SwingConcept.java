// Program for swing concept

import java.awt.Color;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class SwingConcept extends JFrame
{
    SwingConcept()
    {
        setSize(600,600);
        setVisibility(true);
        setTitle("Swing Window");
        getContentPane().setBackground(Color.gray);
        Button btn1 = new Button("Click");
        JButton btn2 = new JButton("Click");
        add(btn1);
        add(btn2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    static public void main(String...args)
    {
        new SwingConcept();
    }
}