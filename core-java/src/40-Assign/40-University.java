import university.University;
import university.college.College;
import student.Student;
import marks.Marks;
import marks.fees.Amount;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

class MainUniversity 
{
	static public void main(String...args)
	{
		Student s = new Student();
		Marks m = new Marks();

		s.get();
		s.getFees();
		m.get();

		s.show();
		m.show();
	}
}