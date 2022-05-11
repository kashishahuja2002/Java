// Program for dialog box

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import javax.swing.JOptionPane;

class DialogBox
{
	static	
	{
		out.println("\n Dialog Box \n Password Program");
	}

    static Scanner sc=new Scanner(in);

    public static void password()
    {
        String pass = JOptionPane.showInputDialog("Enter password: ");
        int confirm = JOptionPane.showConfirmDialog(null,"Are you sure?");
        if(confirm == 0)
        {
            if(pass.equalsIgnoreCase("Kashish"))
                out.println("Welcome...");
            else
            {
                out.print("Invalid Password...");
                System.exit(0);
            }
        }
        if(confirm == 1)
            password();
        if(confirm==2)
            System.exit(0);
    }

    static public void main(String...args)
    {
        password();
    }
}