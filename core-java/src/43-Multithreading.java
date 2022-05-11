// Program for multithreading

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class NewThread extends Thread
{
    String name;
    NewThread(String name)
    {
        this.name = name;
        start();
    }
    public void run()
    {
        Operation.set(name);
    }
}

class Operation
{
    //static void set (String nm)
    synchronized static void set (String nm)
    {
        out.println(nm + "started...");
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ex)
        {
            out.println("Thread Interupted");
        }
        out.println(nm+"Ended...");
    }
}

class Multithreading
{
    static public void main(String...args) throws Exception
    {
        NewThread t1=new NewThread("First");
        t1.join();
        NewThread t2=new NewThread("Second");
    }
}