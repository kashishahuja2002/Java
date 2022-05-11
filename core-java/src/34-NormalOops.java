// Program for normal OOPs

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class IBus
{
    int busNo;
    String city;
    long contact;

    void set(int busNo, String city, long contact)
    {
        this.busNo=busNo;
        this.city=city;
        this.contact=contact;
    }
    void show()
    {
        out.println("--------IBus Details---------");
        out.println(busNo+" "+city+" "+contact);
    }
}

class NormalOops
{
    static public void main(String...args)
    {
        IBus ref=new IBus();
        ref.set(123,"Indore",4203332);
        ref.show();
    }
}