// Program for Exception Handling 

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class JavaMarksException extends RuntimeException
{
    // JavaMarksException()
    // {
    // }
}

class PythonMarksException extends RuntimeException
{
    // PythonMarksException()
    // {
    // }
}

class Marks
{
    void getMarks()
    {
        Scanner sc = new Scanner(in);

        out.println("Enter Java marks: ");
        float java=sc.nextFloat();
        if(java<0 || java>100)
        {
            JavaMarksException ex = new JavaMarksException();
            throw ex;
        }
        else
            out.println("GOOD");

        out.println("Enter python marks: ");
        float python=sc.nextFloat();
        if(python<0 || python>100)
        {
            PythonMarksException ex = new PythonMarksException();
            throw ex;
        }
        else
            out.println("GOOD");
    }
}

class ExceptionHandling
{
    static public void main(String...args)
    {
        Marks ref=new Marks();
        try
        {
            ref.getMarks();
        }
        catch(JavaMarksException | PythonMarksException ex)
        {
            out.println("Marks are out of range.");
            ex.printStackTrace();
        }
        finally
        {
            out.println("Connecting...");
        }
    }
}