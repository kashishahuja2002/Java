
import java.util.*;

class StackForEach {
   
    
    static public void main (String...args) {
        Stack<Integer> s = new Stack<Integer>();  
	s.push(15);  
	s.push(05);  
	s.push(2002);  
	s.push(19);  

	for(Integer data : s) {
            System.out.println(data);
        }  
    }
}
