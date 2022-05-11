// Program for Adapter concept. 
// Event code on window using adapters (MouseAdapter, MouseMotionAdapter, WindowAdapter) by anonymous inner class.

import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.MouseEvent;

class AdapterConcept extends JFrame
{
    AdapterConcept()
    {
        setVisible(true);
        setSize(500,500);
        getContentPane().setBackground(Color.cyan);

        addMouseMotionListener(new MouseMotionAdapter()
            {
                public void mouseMoved(MouseEvent e)
                {
                    getContentPane().setBackground(Color.pink);
                }
            }
        );

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                    // dispose();
                }
            }
        );

        addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                {
                    int red = (int)(Math.random()*200);
                    int green = (int)(Math.random()*200);
                    int blue = (int)(Math.random()*200);

                    getContentPane().setBackground(new Color(red,green,blue));
                }
            }
        );

    }

    public static void main(String...args)
    {
        new AdapterConcept();
    }
}



