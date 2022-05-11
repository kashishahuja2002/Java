// Program to implement StringJoiner logic

import java.util.Scanner;
import static java.lang.System.out;
import java.util.StringJoiner;

class StringJoinerLogic
{
    public static void main(String...args)
    {
        StringJoiner ref = new StringJoiner(", ");
        ref.add("Kashish");
        ref.add("Khushbu");
        out.println(ref);
    }
}