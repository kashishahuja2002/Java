// Program for advance OOPs

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class IBus
{
    int busNo;
    String city;
    long contact;

    IBus(int busNo, String city, long contact)
    {
        this.busNo=busNo;
        this.city=city;
        this.contact=contact;
    }
    public String toString()
    {
        return busNo+" "+city+" "+contact;
    }
}

class AdvanceOops
{
    static public void main(String...args)
    {
        IBus ref=new IBus(123,"Indore",4203332);
        out.println(ref);

            //OR

        out.println(new IBus(111,"Pune",2015232));
    }
}