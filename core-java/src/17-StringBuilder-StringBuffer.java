//  Program for StringBuilder and StringBuffer classes and their methods

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class StringBuilderStringBuffer
{
    public static void main(String...args)
    {
        StringBuilder sb1=new StringBuilder("GirlScript");
        StringBuffer sb2 = new StringBuffer("Winter of Contributing");
        out.println("String:" + sb1);
        out.println("Reverse: " + sb1.reverse());
        out.println("Reverse + Insert: " + sb1.reverse().insert(2,"@@@@"));         // we can combine two or more methods if they are of the same class
        out.println("Delete: " + sb1.delete(2,6));
        sb1.append(" ");
        sb1.append(sb2);
        out.println("Append: " + sb1);
    }
}