// Program for abstract class concept

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

abstract class A
{
    abstract void show();
}

class B extends A
{
    void show()
    {
        out.println("B");
    }
}

class C extends A
{
    void show()
    {
        out.println("C");
    }
}

class AbstractClass
{
    public static void main(String...args)
    {
        A ref=new B();
        ref.show();
        A ref1=new C();
        ref1.show();

            // OR
        
        A ref2[]={new B(), new C()};
        for(int i=0; i<ref2.length; i++)
            ref2[i].show();
    }
}