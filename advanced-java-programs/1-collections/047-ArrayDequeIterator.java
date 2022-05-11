/**
 * @author 24_Kashish Ahuja
 * Program for ArrayDequeue using iterator interface
 */
import java.util.*;

class ArrayDequeIterator {
 
    
    static public void main (String...args) {
        Deque deque = new ArrayDeque();   
	deque.add(1);  
	deque.add("Kash");  
	deque.add(1.25f);  
	deque.add(6.289);  
	deque.add(true);
     	
		Iterator itr=deque.iterator();  
	while(itr.hasNext()){  	
		System.out.println(itr.next());  
	} 
	
    }
}
