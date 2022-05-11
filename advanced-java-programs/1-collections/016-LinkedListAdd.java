/**
 * @author 24_Kashish Ahuja
 */
import java.util.*;

class LinkedListAdd {
    
    static public void main (String...args) {
        LinkedList linklist=new LinkedList();  
        linklist.add(1);  
	linklist.add("Kashish");  
	linklist.add(1.25f);  
	linklist.add(true);  
        System.out.println(linklist);  
        
        linklist.add(2,"new element");
        System.out.println("\nAfter adding element on 2nd index: "+ linklist);
        
        linklist.addFirst("first element");
        System.out.println("\nAfter adding element at the beginning: "+ linklist);
        
        
    }
}
