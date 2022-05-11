// Program for Generics concept

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.ArrayList;

class Generics<any, thing>
{
    any var1;
    thing var2;

    void set(any v1, thing v2)
    {
        var1=v1;
        var2=v2;
    }
    void show()
    {
        out.println(var1+" "+var2);
    }
}

class Main
{
    static public void main(String...args)
    {
        Generics gen= new Generics();
        gen.set(11,'K');
        gen.show();
        gen.set("Kash",15.05f);
        gen.show();
    }
}