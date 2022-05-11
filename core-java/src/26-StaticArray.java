// Program for static array

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class StaticArray
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(in);
        
        out.println("Enter size of array: ");
        byte size = sc.nextByte();
        int arr[] = new int[size];
        out.println("Enter elements of array: ");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();
        out.println("Elements of array are: ");
        for(int i=0; i<size; i++)
            out.print(arr[i]+" ");

        out.println("\n---------------");
        
        out.println("Enter rows and cols: ");
        byte rows = sc.nextByte();
        byte cols = sc.nextByte();
        int arr1[][] = new int[rows][cols];
        out.println("Enter elements of array: ");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr1[i][j]=sc.nextInt();
        out.println("Elements of array are: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
                out.print(arr1[i][j]+" ");
            out.println();
        }
    }
}