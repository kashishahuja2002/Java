// Program for generating Window Frame using AWT

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.awt.Frame;
import java.awt.Color;

class WindowFrame extends Frame
{
    {
        setBackground(Color.cyan);
        setSize(500,500);
        setVisible(true);
    }

    static public void main(String...args)
    {
        new WindowFrame();
    }
}
