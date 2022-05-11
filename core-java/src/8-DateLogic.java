// Program for DateFormat and SimpleDateFormat classes

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class DateLogic
{
    static	
	{
		out.println("\n Date Logic");
	}

    static Scanner sc=new Scanner(in);

    static public void main(String...args)
    {
        Date date = new Date();
        out.println("Date: "+date);

        // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        out.println("SimpleDateFormat: "+sdf.format(date));

        // DateFormat
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        out.println("\nSHORT: "+df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        out.println("MEDIUM: "+df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        out.println("LONG: "+df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL);
        out.println("FULL: "+df.format(date));
    }
}