// Program to convert first character of any sentence to upper case

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class FirstCharToUpperCase
{
    public static char changeCase(char ch)
    {
        int num = (int)ch;
        num = num-32;
        ch=(char)num;
        return ch;
    }

    public static void main(String...args)
    {
        Scanner sc =new Scanner(in);
        out.println("Enter a sentence: ");
        String sen=sc.nextLine();
        int size=sen.length();
        char ch[]=new char[size];
        for(int i=0; i<size; i++)
            ch[i]=sen.charAt(i);
        ch[0]=changeCase(ch[0]);
        
        String str=new String(ch);
        out.println(str);
    }
}