/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using generics
 */
import java.util.*;

class LinkedHashSetForEach {

    
    static public void main (String...args) {
    LinkedHashSet<String> s=new LinkedHashSet<String>(); 
	s.add("Kashish");  
	s.add("Ahuja");  
	s.add("Kash");  
	s.add("Mini");  
	s.add("Min");
 
        for(String data: s)
{
	System.out.println(data);
}
    }
}
