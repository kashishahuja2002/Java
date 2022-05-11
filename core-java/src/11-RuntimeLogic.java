// Program for runtime operarions

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class RuntimeLogic
{
	static	
	{
		out.println("\n Runtime Operations");
	}

    static public void main(String...args) throws Exception
    {
        Runtime run = Runtime.getRuntime();

        // Lock Screen
        //run.exec("C://Windows//System32//rundll32.exe user32.dll, LockWorkStation");

        // Shutdown
        run.exec("shutdown -s");
        // run.exec("shutdown -s -t 60");

        // Log off
        // run.exec("shutdown -l");
        // run.exec("shutdown -l -t -60");

        // Restart
        // run.exec("shutdown -r");
        // run.exec("shutdown -r -t 60");
    }
}