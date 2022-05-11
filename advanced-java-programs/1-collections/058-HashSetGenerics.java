/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using generics
 */
import java.util.*;

class HashSetGenerics {
  
    
    static public void main (String...args) {
    HashSet<String> s=new HashSet<String>(); 
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
