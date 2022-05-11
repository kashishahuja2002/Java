/**
 * @author 24_Kashish Ahuja
 * Program for Priority Queue ForEach
 */
import java.util.*;

class PriorityQueueForEach {
   
    
    static public void main (String...args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");    

        for(String data: queue){  	
		System.out.println(data);  
	}     
    }
}
