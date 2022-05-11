// Program to calculate area and volume of cone, sphere, and cylinder

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;

class AreaVolume
{
  static 
  {
    out.println("\n Area Volume");
    Date date=new Date();
    out.println(date);
  }

  static public void main(String...args)
  {
    Scanner sc = new Scanner(in);
    double pi=3.14, area, volume;

    out.println("\nEnter radius, slant height and height of cone: ");
    double radius=sc.nextDouble();
    double slantHeight=sc.nextDouble();
    double height=sc.nextDouble();
    area=(pi*radius*slantHeight)+(pi*radius*radius);
    volume=(pi*radius*radius*height)/3;
    out.println("Area of cone: "+area);
    out.println("Volume of cone: "+volume);

    out.println("\nEnter radius of sphere: ");
    radius=sc.nextDouble();
    area=4*pi*radius*radius;
    volume=(4*pi*radius*radius*radius)/3;
    out.println("Area of sphere: "+area);
    out.println("Volume of sphere: "+volume);

    out.println("\nEnter radius and height of cylinder: ");
    radius=sc.nextDouble();
    height=sc.nextDouble();
    area=2*pi*radius*(radius+height);
    volume=pi*radius*radius*height;
    out.println("Area of cylinder: "+area);
    out.println("Volume of cylinder: "+volume);
  }
}