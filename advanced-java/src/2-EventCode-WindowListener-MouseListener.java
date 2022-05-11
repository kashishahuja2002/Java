//  Program for event code on window using WindowListener and MouseListener interface

import java.awt.Color;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class EventCodeWindowListenerMouseListener extends JFrame implements WindowListener, MouseListener
{
    {
        setLayout(new FlowLayout());
        setSize(600,600);
        setVisible(true);
        setTitle("Event Code on Window");
        getContentPane().setBackground(new Color(78, 79, 89));
        addWindowListener(this);
        addMouseListener(this);
    }

    static public void main(String...args)
    {
        new EventCodeWindowListenerMouseListener();
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public void mouseClicked(MouseEvent e)
    {
        float red=(float)Math.random();
        float green=(float)Math.random();
        float blue=(float)Math.random();

            // OR

        // int red = (int)(Math.random()*200);
        // int green = (int)(Math.random()*200);
        // int blue = (int)(Math.random()*200);

        getContentPane().setBackground(new Color(red,green,blue));

        System.out.println(red+" "+green+" "+blue);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}