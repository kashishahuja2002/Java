/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using generics
 */
import java.util.*;

class LinkedHashSetGenerics {
  
    
    static public void main (String...args) {
    LinkedHashSet<String> s=new LinkedHashSet<String>(); 
	s.add("Kashish");  
	s.add("Ahuja");  
	s.add("Kash");  
	s.add("Mini");  
	s.add("Min");
 
        Iterator<String> i=s.iterator();  
        while(i.hasNext())  
        {  
           System.out.println(i.next());  
        }  
    }
}
