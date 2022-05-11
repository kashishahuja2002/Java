// Program for command line argument input

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class CommandLineArgument
{
	static	
	{
		out.println("\n Command line argument");
	}

    static Scanner sc=new Scanner(in);

    static public void main(String...args)
    {
        byte first = Byte.parseByte(args[0]);
        short second = Short.parseShort(args[1]);
        int third = Integer.parseInt(args[2]);
        long fourth = Long.parseLong(args[3]);
        float fifth = Float.parseFloat(args[4]);
        double sixth = Double.parseDouble(args[5]);
        boolean seventh = Boolean.parseBoolean(args[6]);
        String eighth = args[7];

        out.println("\n" + first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth + "\n" + sixth + "\n" + seventh + "\n" + eighth);
    }
}