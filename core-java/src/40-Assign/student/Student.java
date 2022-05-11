package student;
import university.college.College;
import marks.fees.Amount;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Student extends College implements Amount
{
	int enrollNo;
	String stuName;
	int fees;
	
	Scanner sc = new Scanner(in);	

	public void getFees()
	{
		out.println("Enter fees: ");
		fees=sc.nextInt();
	}

	public void get()
	{
		super.get();
		out.println("Enter enrollnment no.: ");
		enrollNo = sc.nextInt();
		sc.nextLine();
		out.println("Enter student name: ");
		stuName = sc.nextLine();
	}

	public void show()
	{
		super.show();
		out.println("Enrollnment No.: "+enrollNo);
		out.println("Student Name: "+stuName); 
	}
}