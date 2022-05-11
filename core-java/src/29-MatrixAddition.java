// Program for matrix addition

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class MatrixAddition
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(in);

        out.println("Enter rows and cols in matrix: ");
        byte rows = sc.nextByte();
        byte cols = sc.nextByte();
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        int added[][] = new int[rows][cols];

        out.println("Enter elements of matrix 1: ");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr1[i][j]=sc.nextInt(); 
        out.println("Elements of matrix are 1: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                out.print(arr1[i][j]+" ");
            out.println();
        }

        out.println("Enter elements of matrix 2: ");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr2[i][j]=sc.nextInt(); 
        out.println("Elements of matrix are 2: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                out.print(arr2[i][j]+" ");
            out.println();
        }

        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                added[i][j]=arr1[i][j]+arr2[i][j];
        out.println("Elements of matrix after addition are: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                out.print(added[i][j]+" ");
            out.println();
        }
    }
}