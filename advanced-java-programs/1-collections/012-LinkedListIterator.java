/**
 * @author 24_Kashish Ahuja
 * Program for LinkedList using iterator interface
 */
import java.util.*;

class LinkedListIterator {
  
    
    static public void main (String...args) {
        LinkedList linklist = new LinkedList();  
	linklist.add(1);  
	linklist.add("Kash");  
	linklist.add(1.25f);  
	linklist.add(6.2861);  
	linklist.add(true);  

	Iterator iterator = linklist.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
