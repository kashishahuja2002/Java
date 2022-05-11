// Program for String to Char Array and Char Array to String Conversion

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

class StringCharArrayConversion
{
    public static void main(String...args)
    {
        char ch[]={'a','b','c','d','e'};
        String str=new String(ch);
        out.println(str);

        String str1=new String("Kashish");
        int size=str1.length();
        char ch1[]=new char[size];
        for(int i=0; i<size; i++)
        {
            ch1[i]=str1.charAt(i);
            out.println(ch1[i]);
        }
        
    }
}