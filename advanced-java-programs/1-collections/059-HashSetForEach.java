/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using generics
 */
import java.util.*;

class HashSetForEach {

    
    static public void main (String...args) {
    HashSet<String> s=new HashSet<String>(); 
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
