//  Program to calculate area of circle, triangle, and rectange

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;

class Area
{
    static 
    {
		out.println("\n Area");
		Date date=new Date();
		out.println(date);
    }

    static public void main(String...args)
    {
        Scanner sc = new Scanner(in);
        double pi=3.14, area;

        out.println("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        area=(pi)*radius*radius;
        out.println("Area of circle: "+area);

        out.println("\nEnter base of triangle: ");
        double base=sc.nextDouble();
        out.println("Enter height of triangle: ");
        double height=sc.nextDouble();
        area=(base*height)/2;
        out.println("Area of triangle: "+area);

        out.println("\nEnter length of rectangle: ");
        double length = sc.nextDouble();
        out.println("\nEnter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        area=length*breadth;
        out.println("Area of square: "+area);
    }
}