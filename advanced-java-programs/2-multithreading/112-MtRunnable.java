/* Java Thread Example by implements Runnable */

class MtRunnable implements Runnable
{  
	public void run()
	{  
		System.out.println("thread is running...");  
	}  

	public static void main(String args[])
	{  
		MtThread m1=new MtThread();  
 		Thread t1 =new Thread(m1);
		t1.start();  
 	}  
}  