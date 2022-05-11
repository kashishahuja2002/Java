// Program for array of 1D array

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class ArrayOf1DArray
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(in);

        out.println("Enter number of rows: ");
        byte rows = sc.nextByte();
        int arr[][] = new int[rows][];
        for(int i=0; i<rows; i++)
        {
            out.println("Enter number of cols in row " + i + ": ");
            byte cols = sc.nextByte();
            arr[i]=new int[cols];
        }
        out.println("Enter elements of array: ");
        for(int i=0; i<rows; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j]=sc.nextInt();
        out.println("Elements of array are: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<arr[i].length; j++)
                out.print(arr[i][j]+" ");
            out.println();
        }
    }
}