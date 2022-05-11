// Program for array implementation by ArrayList class

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.ArrayList;

class ArrayListConcept
{
    static public void main (String...args)
    {
        ArrayList list = new ArrayList();
        list.add('K');
        list.add(15);
        list.add(true);
        list.add(15.05);
        list.add("Kash");
        out.println("List: "+ list);
        out.println("Size of list: "+ list.size());
        out.println("Element at 2nd index of list: "+ list.get(2));
        out.println("\n----------------------\n");

        // restricting using generics
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(15);
        list2.add(05);
        list2.add(2002);
        out.println("List: " + list2);
        out.println("Size of list: "+ list2.size());
        out.println("Element at 2nd index of list: "+ list2.get(2));

        java.util.Collections.sort(list2);
        out.println("List after sorting: "+list2);
        out.println("\n----------------------\n");

        // for loop
        for(int i=0; i<list.size(); i++)
            out.println(list.get(i));
        out.println("\n----------------------\n");

        // for each loop
        for(Integer data : list2)
            out.println(data);
        out.println("\n----------------------\n");

        // lamda expression
        list.forEach(data->out.println(data));
        out.println("\n----------------------\n");
                    //OR
        list2.forEach(data->
            out.println(data)
        );
    }
}