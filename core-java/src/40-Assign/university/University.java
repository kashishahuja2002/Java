package university;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class University
{
	int regNo;
	String uniName;
	
	Scanner sc = new Scanner(in);	

	public void get()
	{
		out.println("Enter registration no.: ");
		regNo = sc.nextInt();
		sc.nextLine();
		out.println("Enter university name: ");
		uniName = sc.nextLine();
	}

	public void show()
	{
		out.println("Registration No.: "+regNo);
		out.println("University Name: "+uniName); 
	}
}