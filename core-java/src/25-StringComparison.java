// Program to implement 4 ways to compare string

import java.util.Scanner;
import static java.lang.System.out;

class StringComparison
{
    static public void main(String...args)
    {
        // String str1 = "Kashish";
        // String str2 = "Kashish";

        String str1 = new String("Kashish");
        String str2 = new String("Kashish");

        // checks address
        if(str1==str2)
            out.println("Same");
        else
            out.println("Not same");

        // check values
        if(str1.equals(str2))
            out.println("Same");
        else
            out.println("Not same");

        // check values ignoring case
        if(str1.equalsIgnoreCase(str2))
            out.println("Same");
        else
            out.println("Not same");

        // check ASCII difference
        if(str1.compareTo(str2)==0)
            out.println("Same");
        else
            out.println("Not same" + str1.compareTo(str2));
    }   
}
