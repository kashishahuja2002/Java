// Program to check whether a given string is palindrome or not

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class PalindromeString
{
    public static void main(String...args)
    {
        Scanner sc =new Scanner(in);
        out.println("Enter a String: ");
        String sen=sc.next();
        sen=sen.toLowerCase();
        int size=sen.length();
        boolean flag=true;
        for(int i=0; i<size/2; i++)
        {
            if(sen.charAt(i)!=sen.charAt(size-1-i))
            {
                out.println("Not a palindrome");
                flag=false;
                break;
            }
        }
        if(flag==true)
            out.println("Palindrome");
    }
}