// Program for event code on window using ActionListener

import java.awt.Color;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class EventCodeActionListener extends JFrame implements ActionListener
{
    Button btn;

    {
        setLayout(new FlowLayout());
        setSize(600,600);
        setVisible(true);
        setTitle("Event Code on Window");
        getContentPane().setBackground(new Color(78, 79, 89));
    }

    EventCodeActionListener()
    {
        btn = new Button("click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String value=e.getActionCommand();
        if(value.equals("click"))
        {
            int red = (int)(Math.random()*200);
            int green = (int)(Math.random()*200);
            int blue = (int)(Math.random()*200);

            // btn.setBackground(new Color(red, green, blue));
            getContentPane().setBackground(new Color(red,green,blue));
        }
    }

    static public void main(String...args)
    {
        new EventCodeActionListener();
    }
}