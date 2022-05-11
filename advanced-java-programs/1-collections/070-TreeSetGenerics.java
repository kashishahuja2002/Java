/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using generics
 */
import java.util.*;

class TreeSetGenerics {
 
    
    static public void main (String...args) {
    TreeSet<String> s=new TreeSet<String>(); 
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
