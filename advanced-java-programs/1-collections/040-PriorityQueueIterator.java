/**
 * @author 24_Kashish Ahuja
 * Program for Priority Queue using iterator interface
 */
import java.util.*;

class PriorityQueueIterator {
 
    
    static public void main (String...args) {
        PriorityQueue queue=new PriorityQueue();  
	queue.add(4);  
	queue.add(2);  
	queue.add(1);  
    
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  	
		System.out.println(itr.next());  
	}   
    }
}
