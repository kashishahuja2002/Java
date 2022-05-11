/* Java Thread Example by extending Thread class */

class MtThread extends Thread 
{  
	public void run()
	{  
		System.out.println("thread is running...");  
	}  

	public static void main(String args[])
	{  
		MtThread t1=new MtThread();  
		t1.start();  
 	}  
}  