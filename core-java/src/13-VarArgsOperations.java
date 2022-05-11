/* Program for operations using VarArgs
1) Searching of an element
2) Sorting of elements
3) Sorting of even and odd numbers seperately
4) To filter even and odd numbers seperately
5) To find out prime numbers out of given var args */


import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class VarArgsOperations
{
	static	
	{
		out.println("\n VarArgs Operations");
        out.println("\n\t\t\t\t Operations");
        out.println("1) Searching of an element \n2) Sorting of elements \n3) Sorting of even and odd numbers seperately \n4) To filter even and odd numbers seperately \n5) To find out prime numbers out of given var args");
        out.println("\nSelect an operation: ");
	}

    static Scanner sc = new Scanner(in);

    // 1) Searching of an element
    public static void searching(int...args)
    {
        out.println("\nEnter the element to be searched: ");
        int search = sc.nextInt();
        int e=0;
        for(int i=0; i<args.length; i++)
        {
            if(search==args[i])
            {
                out.println("Element " + search + " found on index "+ i);
                e=1;
            }
        }
        if(e==0)
            out.println("Element " + search + " not found");
    }

    // 2) Sorting of elements
    public static void sorting(int...args)
    {
        int temp;
        int n=args.length;

        // java.util.Arrays.sort(args);
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<(n-1); j++)
            {
                if(args[j]>args[j+1])
                {
                    temp=args[j];
                    args[j]=args[j+1];
                    args[j+1]=temp;
                }
            }
        }

        out.println("\nElements after sorting: ");
        for(int data : args)
            out.println(data + " ");
    }

    // 3) Sorting of even and odd numbers seperately
    public static void evenOddSorting(int...args)
    {
        int temp;
        int n=args.length;

        // java.util.Arrays.sort(args);
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<(n-1); j++)
            {
                if(args[j]>args[j+1])
                {
                    temp=args[j];
                    args[j]=args[j+1];
                    args[j+1]=temp;
                }
            }
        }

        int even[] = new int[n/2+1];
        int odd[] = new int[n/2+1];
        int e=-1, o=-1;

        for(int i=0; i<n; i++)
        {
            if(args[i]%2==0)
            {
                e++;
                even[e]=args[i];
            }
            if(args[i]%2!=0)
            {
                o++;
                odd[o]=args[i];
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
    public static void evenOdd(int...args)
    {
        int n=args.length;
        int even[] = new int[n/2+1];
        int odd[] = new int[n/2+1];
        int e=-1, o=-1;

        for(int i=0; i<n; i++)
        {
            if(args[i]%2==0)
            {
                e++;
                even[e]=args[i];
            }
            if(args[i]%2!=0)
            {
                o++;
                odd[o]=args[i];
            }
        }

        out.println("\nEven: ");
        for(int i=0; i<=e; i++)
            out.println(even[i]+" ");

        out.println("\nOdd: ");
        for(int i=0; i<=o; i++)
            out.println(odd[i] + " ");
    }

    // 5) To find out prime numbers out of given var args
    public static void prime(int...args)
    {
        int n=args.length;
        int prime[] = new int[n];
        int p=-1;

        for(int i=0; i<n; i++)
        {
            int j=2, num=args[i], bool=0;
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

    static public void main(String...ar) 
    {
        byte opr = sc.nextByte();
        switch(opr)
        {
            case 1: searching(4,5,75,32,15,68,94,53,26);
                    break;

            case 2: sorting(4,5,75,32,15,68,94,53,26);
                    break;

            case 3: evenOddSorting(4,5,75,32,15,68,94,53,26);
                    break;

            case 4: evenOdd(4,5,75,32,15,68,94,53,26);
                    break;

            case 5: prime(4,5,75,32,15,68,94,53,26);
                    break;        
        }
    }
    
}