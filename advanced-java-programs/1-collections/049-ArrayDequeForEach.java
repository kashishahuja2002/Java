/**
 * @author 24_Kashish Ahuja
 * Program for ArrayDeque using for each
 */
import java.util.*;

class ArrayDequeForEach {
   
    static public void main (String...args) {
        Deque<String> queue=new ArrayDeque<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");    

        for(String data:queue){  	
		System.out.println(data);  
	}   
    }
}
