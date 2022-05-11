/**
 * @author 24_Kashish Ahuja
 * Program for LinkedList with generics
 */
import java.util.*;

class LinkedListGenerics {
  
    
    static public void main (String...args) {
        LinkedList<String> linklist = new LinkedList<String>();  
	linklist.add("Kashish");  
	linklist.add("Ahuja");  
	linklist.add("Kash");  
	linklist.add("Mini");  
	linklist.add("Min");  

	Iterator<String> iterator = linklist.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
