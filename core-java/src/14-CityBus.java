// City Bus Assignment
/* Display fair charges as per source and destination input
Display bus no. as per route input
Display route details as per bus no. input
Display card charges as per category input */

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import javax.swing.JOptionPane;

class CityBus
{
	static	
	{
		out.println("\n City Bus");
	}

	static Scanner sc = new Scanner(in);

	public static void fairCharges()
	{
		String source = JOptionPane.showInputDialog("\nSources: \nGeeta Bhawan Square : GBS \nBhawarkua Square : BS \nSatya Sai Square : SSS \n\nEnter your source: ");
		String destination = JOptionPane.showInputDialog("\nDestination: \nGeeta Bhawan Square : GBS \nBhawarkua Square : BS \nSatya Sai Square : SSS \n\nEnter your destination: ");

		int fair=0;

		if(source.equalsIgnoreCase("GBS") && destination.equalsIgnoreCase("BS"))
			fair=20;
		if(source.equalsIgnoreCase("GBS") && destination.equalsIgnoreCase("SSS"))
			fair=30;
		if(source.equalsIgnoreCase("BS") && destination.equalsIgnoreCase("GBS"))
			fair=20;
		if(source.equalsIgnoreCase("BS") && destination.equalsIgnoreCase("SSS"))
			fair=45;
		if(source.equalsIgnoreCase("SSS") && destination.equalsIgnoreCase("GBS"))
			fair=30;
		if(source.equalsIgnoreCase("SSS") && destination.equalsIgnoreCase("BS"))
			fair=45;

		JOptionPane.showMessageDialog(null, "Fair charges: Rs" + fair);
	}

	public static void busNo()
	{
		String source = JOptionPane.showInputDialog("\nSources: \nGeeta Bhawan Square : GBS \nBhawarkua Square : BS \nSatya Sai Square : SSS \n\nEnter your source: ");
		String destination = JOptionPane.showInputDialog("\nDestination: \nGeeta Bhawan Square : GBS \nBhawarkua Square : BS \nSatya Sai Square : SSS \n\nEnter your destination: ");

		if(source.equalsIgnoreCase("GBS") && destination.equalsIgnoreCase("BS"))
		{
			JOptionPane.showMessageDialog(null, "\nBus No. : 3");
		}
		if(source.equalsIgnoreCase("GBS") && destination.equalsIgnoreCase("SSS"))
		{
			JOptionPane.showMessageDialog(null, "\nBus No. : 1");
		}
		if(source.equalsIgnoreCase("BS") && destination.equalsIgnoreCase("GBS"))
		{
			JOptionPane.showMessageDialog(null, "\nBus No. : 4");
		}
		if(source.equalsIgnoreCase("BS") && destination.equalsIgnoreCase("SSS"))
		{
			JOptionPane.showMessageDialog(null, "\nThere is no direct bus from Bhawarkua Square to Satya Sai Square. \n First take bus no. 4 from Bhawarkua Square to Geeta Bhawan Square and then change to bus no. 1 from Geeta Bhawas Square to Satya Sai Square");
		}
		if(source.equalsIgnoreCase("SSS") && destination.equalsIgnoreCase("GBS"))
		{
			JOptionPane.showMessageDialog(null, "\nBus No. : 2");
		}
		if(source.equalsIgnoreCase("SSS") && destination.equalsIgnoreCase("BS"))
		{
			JOptionPane.showMessageDialog(null, "\nThere is no direct bus from Satya Sai Square to Bhawarkua Square. \n First take bus no. 2 from Satya Sai Square to Geeta Bhawan Square and then change to bus no. 3 from Geeta Bhawas Square to Bhawarkua Square");
		}
	}

	public static void routeDetails()
	{
		byte bus = Byte.parseByte(JOptionPane.showInputDialog("\nFor getting route details enter your bus no. (1-4): "));
		switch(bus)
		{
			case 1: JOptionPane.showMessageDialog(null,"\nBus no. 1 \nRoute Details \nFrom: Geeta Bhawan Square \nTo: Satya Sai Square");
					break;

			case 2: JOptionPane.showMessageDialog(null,"\nBus no. 2 \nRoute Details \nFrom: Satya Sai Square \nTo: Geeta Bhawan Square");
					break;

			case 3: JOptionPane.showMessageDialog(null,"\nBus no. 3 \nRoute Details \nFrom: Geeta Bhawan Square \nTo: Bhawarkua Square");
					break;

			case 4: JOptionPane.showMessageDialog(null,"\nBus no. 4 \nRoute Details \nFrom: Bhawarkua Square \nTo: Geeta Bhawan Square");
					break;
		}
	}

	public static void cardCharges()
	{
		String category = JOptionPane.showInputDialog("\nCategories: \nAll\nSenior Citizens\nStudent\nDisabled \n\nEnter your category: ");

		int cardCharge=0;
		if(category.equalsIgnoreCase("All"))
			cardCharge=500;
		else if(category.equalsIgnoreCase("Senior Citizens"))
			cardCharge=250;
		if(category.equalsIgnoreCase("Student"))
			cardCharge=200;
		if(category.equalsIgnoreCase("Disabled"))
			cardCharge=150;
		
		JOptionPane.showMessageDialog(null, "Card charges: Rs" +cardCharge +" per month");
	}

    static public void main(String...args) 
    {
		byte info = Byte.parseByte(JOptionPane.showInputDialog("\n\t\t\t\t City Bus \n1) Fair charges \n2) Bus no. \n3) Route details \n4) Card charges \n\n\nWhat information you want to know: "));

		switch(info)
        {
            case 1: fairCharges();
                    break;

            case 2: busNo();
                    break;

            case 3: routeDetails();
                    break;

            case 4: cardCharges();
                    break;     
        }
    }
    
}