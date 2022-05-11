
import java.util.*;

class ArrayDequeGenerics {
 
    
    static public void main (String...args) {
        Deque<String> queue=new ArrayDeque<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");    

        Iterator<String> itr=queue.iterator();  
	while(itr.hasNext()){  	
		System.out.println(itr.next());  
	}   
    }
}
