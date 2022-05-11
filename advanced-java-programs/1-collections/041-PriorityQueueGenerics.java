/**
 * @author 24_Kashish Ahuja
 * Program for Priority Queue with generics
 */
import java.util.*;

class PriorityQueueGenerics {
   
    
    static public void main (String...args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");    

        Iterator itr=queue.iterator();  
	while(itr.hasNext()){  	
		System.out.println(itr.next());  
	}     
    }
}
