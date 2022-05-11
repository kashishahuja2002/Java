import java.util.*;

class ThreadJoin implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
            System.out.println(i);
    }

    public static void main(String...args)
    {
        ThreadJoin th=new ThreadJoin();
        Thread t1=new Thread(th);
        Thread t2=new Thread(th);

        t1.start();
        try {
            t1.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}