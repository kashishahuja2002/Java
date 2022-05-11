/**
 * @author 24_Kashish Ahuja
 * Program for HashSet concept
 */
import java.util.*;

class LinkedHashSetConcept {
 
    
    static public void main (String...args) {
        LinkedHashSet s=new LinkedHashSet(); 
	s.add(1);  
	s.add("Kash");  
	s.add(1.25f);  
	s.add(6.289);  
	s.add(true);  
 
        System.out.println(s);
    }
}
