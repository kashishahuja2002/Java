package marks;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Marks
{
	float c, cpp, java;
	
	Scanner sc = new Scanner(in);	

	public void get()
	{
		out.println("Enter C marks: ");
		c = sc.nextFloat();
		out.println("Enter C++ marks: ");
		cpp = sc.nextFloat();
		out.println("Enter Java marks: ");
		java = sc.nextFloat();
	}

	public void show()
	{
		out.println("C marks: "+c);
		out.println("C++ marks: "+cpp);
		out.println("Java marks: "+java); 
	}
}