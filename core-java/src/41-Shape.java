// Program for Shape

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

abstract class Shape
{
    abstract void volume();
    abstract void show();
}

class Sphere extends Shape
{
    Scanner sc = new Scanner(in);
    double pi=3.14, volume, radius;

    void volume()
    {
        out.println("\nEnter radius of sphere: ");
        radius=sc.nextDouble();
        volume=(4*pi*radius*radius*radius)/3;
    }

    void show()
    {
        out.println("Volume of sphere: "+volume);
    }
}

class Cylinder extends Shape
{
    Scanner sc = new Scanner(in);
    double pi=3.14, volume, radius, height;

    void volume()
    {
        out.println("\nEnter radius and height of cylinder: ");
        radius=sc.nextDouble();
        height=sc.nextDouble();
        volume=pi*radius*radius*height;
    }

    void show()
    {
        out.println("Volume of cylinder: "+volume);
    }
}

class Cone extends Shape
{
    Scanner sc = new Scanner(in);
    double pi=3.14, volume, radius, slantHeight, height;

    void volume()
    {
        out.println("\nEnter radius, slant height and height of cone: ");
        radius=sc.nextDouble();
        slantHeight=sc.nextDouble();
        height=sc.nextDouble();
        volume=(pi*radius*radius*height)/3;
    }

    void show()
    {
        out.println("Volume of cone: "+volume);
    }
}

class MainShape
{
    public static void main(String...args)
    {
        Shape s[] = {new Sphere(), new Cylinder(), new Cone()};
        for(int i=0; i<s.length; i++)
        {
            s[i].volume();
            s[i].show();
        }
    }
}