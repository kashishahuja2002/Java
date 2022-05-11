// Collection and Framework Generics
// Program for List Concept

import java.util.LinkedList;
import static java.lang.System.out;

class ListConcept
{
    public static void main(String...args)
    {
        LinkedList list = new LinkedList();
        list.add("abc");
        list.add('a');
        list.add(3433);
        list.add(111);
        list.add(true);
        list.add(55.55f);
        out.println(list);
        out.println(list.get(1));
        list.remove(3);
        // list.removeAll(list);

        if(list.isEmpty())
            System.out.println("List is empty.");
        else
        {
            LinkedList list1=list;
            for(int i=100; i<120; i++)
                if(i%2==0)
                    list1.add(i);
            out.println(list);
            out.println(list1);
        }
    }
}
