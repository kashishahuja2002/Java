// Program for serialization
// Serializable, FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class IBus implements Serializable
{
    int busNo; 
    String city;
    
    IBus()
    {}

    IBus(int busNo, String city)
    {
        this.busNo = busNo;
        this.city = city; 
    }
    void show()
    {
        out.println(busNo+" "+city);
    }
}

class Serialization
{
    static public void main(String...args) throws Exception
    {
        IBus ref= new IBus(111,"Indore");
        FileOutputStream fos = new FileOutputStream("Serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ref);
        oos.close();

        FileInputStream fis = new FileInputStream("Serialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        IBus ref1 = new IBus();
        ref1 = (IBus)ois.readObject();          // down Casting
        ref1.show();
    }
}