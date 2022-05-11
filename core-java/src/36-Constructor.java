// Program for constructors and initialized block

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Constructor
{
    Constructor()                                   // default or 0-argument constructor
    {
        out.println("Default Constructor");
    }

    static
    {
        out.println("Static block 1");
    }

    static
    {
        out.println("Static block 2");
    }

    {                                               // Initialized block                       
        out.println("Initialized block");   
    }

    Constructor(int first, String second)           // Parameterized constructor
    {
        out.println("Parameterized constructor");
    }

    Constructor(Constructor ref)                    // Copy Constructor
    {
        out.println("Copy Constructor");
    }
}

class Main 
{
    static public void main(String...args)
    {
        new Constructor();      
        new Constructor(new Constructor(new Constructor(121,"Kash")));
    }
}