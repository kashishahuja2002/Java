package university.college;
import university.University;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class College extends University
{
	String collName;
	String services;
	
	Scanner sc = new Scanner(in);	

	public void get()
	{
		super.get();
		out.println("Enter college name: ");
		collName = sc.nextLine();
		out.println("Enter services: ");
		services = sc.nextLine();
	}

	public void show()
	{
		super.show();
		out.println("College name: "+collName);
		out.println("Services: "+services); 
	}
}