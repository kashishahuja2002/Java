// Collection and Framework Generics
// Program for Set Concept

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

class SetConcept
{
    public static void main(String...args)
    {
        // HashSet set=new HashSet();
        TreeSet set=new TreeSet();
        set.add(4544);
        set.add(444);
        set.add(44);
        set.add(4544);
        set.add(4);
        set.add(45441);
        System.out.println(set);
        System.out.println(set.size());

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
