
import java.util.*;

class StackGenerics {
  
    
    static public void main (String...args) {
        Stack<String> s = new Stack<String>();  
	s.push("Kashish");  
	s.push("Ahuja");  
	s.push("Kash");  
	s.push("Mini");  
	s.push("Min");  

	Iterator iterator = s.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
