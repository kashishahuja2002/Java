// Program to convert lower case word to upper case and vise versa without using built-in methods

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class UpperLower
{
    public static char upperCase(char ch)
    {
        int num = (int)ch;
        num = num-32;
        ch=(char)num;
        return ch;
    }

    public static char lowerCase(char ch)
    {
        int num = (int)ch;
        num = num+32;
        ch=(char)num;
        return ch;
    }

    public static void main(String...args)
    {
        Scanner sc =new Scanner(in);

        out.println("\nEnter a lower case word: ");
        String sen=sc.nextLine();
        int size=sen.length();
        char ch[]=new char[size];
        for(int i=0; i<size; i++)
        {
            ch[i]=sen.charAt(i);
            ch[i]=upperCase(ch[i]);
        }
        String strU=new String(ch);
        out.println("Upper Case: "+strU);

        out.println("\nEnter an upper case word: ");
        String str=sc.nextLine();
        size=str.length();
        char ch2[]=new char[size];
        for(int i=0; i<size; i++)
        {
            ch2[i]=str.charAt(i);
            ch2[i]=lowerCase(ch2[i]);
        }
        String strL=new String(ch2);
        out.println("Lower Case: "+strL);
    }
}