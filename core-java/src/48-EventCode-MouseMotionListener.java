// Program for event code on window using MouseMotionListener interface

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

class EventCodeMouseMotionListener extends Frame implements MouseMotionListener
{
    {
        setBackground(Color.cyan);
        setSize(500,500);
        setVisible(true);
        addMouseMotionListener(this);              // registry of interface on current window
    }

    static public void main(String...args)
    {
        new EventCodeMouseMotionListener();
    }

    public void mouseDragged(MouseEvent e){}

    public void mouseMoved(MouseEvent e)
    {
        setBackground(Color.pink);
    }
}
