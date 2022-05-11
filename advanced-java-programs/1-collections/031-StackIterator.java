
import java.util.*;

class StackIterator {
 
    
    static public void main (String...args) {
        Stack s = new Stack();  
	s.push(1);  
	s.push("Kashish");  
	s.push(1.25f);  
	s.push(6.289);  
	s.push(true);  

	Iterator iterator = s.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
