/**
 * @author 24_Kashish Ahuja
 * Program for LinkedList using for each loop
 */
import java.util.*;

class LinkedListForEach {

    
    static public void main (String...args) {
        LinkedList<Integer> linklist = new LinkedList<Integer>();  
	linklist.add(15);  
	linklist.add(05);  
	linklist.add(2002);  
	linklist.add(19);

	for(Integer data : linklist) {
            System.out.println(data);
        }
    }
}
