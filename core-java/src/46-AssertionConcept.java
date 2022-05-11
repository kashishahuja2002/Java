// Program for assertion concept

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Assertion
{
    void variable(int var)
    {
        var=var*10;
        assert(var==1000):"Not 1000";
        out.println(var);
    }
}

class AssertionConcept
{
    static public void main(String...args)
    {
        Scanner sc = new Scanner(in);
        out.println("Enter value of var: ");
        int var = sc.nextInt();
        Assertion a = new Assertion();
        a.variable(var);
    }
}