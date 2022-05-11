import java.util.*;

class ThreadSync extends Thread 
{
	private String threadMsg;
	ThreadSync(String msg) {
		threadMsg = msg;
	}

	synchronized void print() {
	    for(int i=1; i<=5; i++)
		    System.out.println(threadMsg);
    }

    public void run() {
	    print();
    }

    public static void main(String...args)
    {
        ThreadSync t1=new ThreadSync("IIPS");
        t1.start();
        ThreadSync t2=new ThreadSync("DAVV");
        t2.start();
    }    
}