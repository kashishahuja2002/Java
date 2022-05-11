// Program to perform all VarArr operations by 1D array

/* Operations
1) Searching of an element
2) Sorting of elements
3) Sorting of even and odd numbers seperately
4) To filter even and odd numbers seperately
5) To find out prime numbers out of given var arr */


import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class ArrayOperations
{
	static	
	{
		out.println("\n Array Operations");
	}

    static Scanner sc = new Scanner(in);

    // 1) Searching of an element
    public static void searching(int[] arr)
    {
        out.println("\nEnter the element to be searched: ");
        int search = sc.nextInt();
        int e=0;
        for(int i=0; i<arr.length; i++)
        {
            if(search==arr[i])
            {
                out.println("Element " + search + " found on index "+ i);
                e=1;
            }
        }
        if(e==0)
            out.println("Element " + search + " not found");
    }

    // 2) Sorting of elements
    public static void sorting(int[] arr)
    {
        int temp;
        int n=arr.length;

        // java.util.Arrays.sort(arr);
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<(n-1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        out.println("\nElements after sorting: ");
        for(int data : arr)
            out.println(data + " ");
    }

    // 3) Sorting of even and odd numbers seperately
    public static void evenOddSorting(int[] arr)
    {
        int temp;
        int n=arr.length;

        // java.util.Arrays.sort(arr);
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<(n-1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int even[] = new int[n/2+1];
        int odd[] = new int[n/2+1];
        int e=-1, o=-1;

        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                e++;
                even[e]=arr[i];
            }
            if(arr[i]%2!=0)
            {
                o++;
                odd[o]=arr[i];
            }
        }

        out.println("\nEven after sorting: ");
        for(int i=0; i<=e; i++)
            out.println(even[i]+" ");

        out.println("\nOdd after sorting: ");
        for(int i=0; i<=o; i++)
            out.println(odd[i] + " ");
    }

    // 4) To filter even and odd numbers seperately
    public static void evenOdd(int[] arr)
    {
        int n=arr.length;
        int even[] = new int[n/2+1];
        int odd[] = new int[n/2+1];
        int e=-1, o=-1;

        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                e++;
                even[e]=arr[i];
            }
            if(arr[i]%2!=0)
            {
                o++;
                odd[o]=arr[i];
            }
        }

        out.println("\nEven: ");
        for(int i=0; i<=e; i++)
            out.println(even[i]+" ");

        out.println("\nOdd: ");
        for(int i=0; i<=o; i++)
            out.println(odd[i] + " ");
    }

    // 5) To find out prime numbers out of given var arr
    public static void prime(int[] arr)
    {
        int n=arr.length;
        int prime[] = new int[n];
        int p=-1;

        for(int i=0; i<n; i++)
        {
            int j=2, num=arr[i], bool=0;
            while(j<=(num/2))
            {
                if(num%j==0)
                    bool=1;
                j++;
            }
            if(bool==0)
            {
                p++;
                prime[p]=num;
            }
        }

        out.println("\nPrime numbers: ");
        for(int i=0; i<=p; i++)
            out.println(prime[i]+" ");
    }

    static public void main(String...args) 
    {
        
        out.println("Enter size of array: ");
        byte size = sc.nextByte();
        int arr[] = new int[size];
        out.println("Enter elements of array: ");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();

        out.println("\n\t\t\t\t Operations");
        out.println("1) Searching of an element \n2) Sorting of elements \n3) Sorting of even and odd numbers seperately \n4) To filter even and odd numbers seperately \n5) To find out prime numbers out of given array");
        out.println("\nSelect an operation: ");
        byte opr = sc.nextByte();

        switch(opr)
        {
            case 1: searching(arr);
                    break;

            case 2: sorting(arr);
                    break;

            case 3: evenOddSorting(arr);
                    break;

            case 4: evenOdd(arr);
                    break;

            case 5: prime(arr);
                    break;        
        }
    }
    
}