// Program for operations on string

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class StringOperations
{
    static 
    {
        out.println("\nString Opertions");
    }

    public static void main(String...args)
    {
        String str="Kashish Ahuja";
        out.println(str.toUpperCase());

        str="KASHISH AHUJA";
        out.println(str.toLowerCase());

        str="     Kashish Ahuja     ";
        out.println(str.length());
        out.println(str);
        out.println(str.trim());

        str="Kashish Ahuja, M.Tech(IT), IIPS, DAVV";
        out.println(str.startsWith("Ka"));
        out.println(str.endsWith("VVV"));
        out.println(str.replace('I','i'));

        str="Kashish ";
        out.println(str.replaceAll("Kashish ", "KA"));
        out.println(str.indexOf('K'));
        out.println(str.charAt(5));

        String str1="Ahuja";
        out.println(str.concat(str1));
    }
}