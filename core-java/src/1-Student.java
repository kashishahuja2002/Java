import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Student
{
	static public void main(String...args)
	{
		out.println("\nEnter following details of Students...");
        static Scanner sc = new Scanner(in);
		out.println("\nEnter student roll no.: ");
		short rollNo=sc.nextShort();
		out.println("Enter student name: ");
		String name=sc.next();
		out.println("Enter marks obtained in Hindi: ");
		float hindi=sc.nextFloat();
		out.println("Enter marks obtained in English: ");
		float eng=sc.nextFloat();
        out.println("Enter marks obtained in Phy: ");
		float phy=sc.nextFloat();
        out.println("Enter marks obtained in Chem: ");
		float chem=sc.nextFloat();
        out.println("Enter marks obtained in Maths: ");
		float maths=sc.nextFloat();

		float totalMarks=hindi+eng+phy+chem+maths;
		float percentage=(totalMarks*100)/500.0;
		out.println("\nPercentage: "+percentage+"%");

		if(percentage>90.0)
			out.println("Grade: A");
		else if(percentage>80.0)
			out.println("Grade: B");
		else if(percentage>70.0)
			out.println("Grade: C");
		else if(percentage>60.0)
			out.println("Grade: D");
		else if(percentage>50.0)
			out.println("Grade: E");
		else 
			out.println("Grade: F");

	}
}