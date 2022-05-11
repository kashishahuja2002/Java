// Program for VarArgs and For Each loop

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class VarArgsForEachLoop
{
	static	
	{
		out.println("\n VarArgs and For Each loop");
	}

    public static void fun(int...args)
    {
        // For Each Loop
        for(int data : args)
            out.print("\n"+data);
    }

    static public void main(String...args) 
    {
        fun(4,5,75,32,15,68,94,53,26);
    }
    
}