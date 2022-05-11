// Program for String.format() method and NumberFormat class

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;
import java.text.NumberFormat;

class StringFormatNumberFormat
{
	static	
	{
		out.println("\n String.format() method and NumberFormat class");
		Date date=new Date();
		out.println(date);	
	}

    static Scanner sc=new Scanner(in);

    static public void main(String...args)
    {
        out.println("Enter a number: ");
        double data = sc.nextDouble();
        String output = String.format("%.2f",data);
        out.println("\nString Format: "+output);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(4);
        out.println("NumberFormat: "+nf.format(data));
    }
}