// Program for interface concept

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class A
{
    void show()
    {
        out.println("A");
    }
}

interface B
{
    void show();
}

interface B1 extends B
{
    void show1();
}

// class C extends A implements B,B1
class C extends A implements B1
{
    public void show()
    {
        super.show();
        out.println("Interface B");
    }

    public void show1()
    {
        out.println("Interface B1");
    }

    void get()
    {
        out.println("C");
    }
}

class InterfaceConcept
{
    public static void main(String...args)
    {
        C ref = new C();
        ref.show();
        ref.show1();
        ref.get();
    }
}