// Program to find sum of all the diagonal elements of matrix
// (i==j) || (i+j==(rows-1))

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class DiagonalElements
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(in);
        
        out.println("Enter rows and cols of matrix: ");
        byte rows = sc.nextByte();
        byte cols = sc.nextByte();
        int arr[][] = new int[rows][cols];
        out.println("Enter elements of matrix: ");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr[i][j]=sc.nextInt();
        out.println("Elements of matrix are: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                out.print(arr[i][j]+" ");
            out.println();
        }

        int sum=0; 
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                if((i==j) || (i+j==(rows-1)))
                    sum=sum+arr[i][j];
            }
        }
        out.println("Sum of diagonal elements is: "+sum);
    }
}