/**
 * @author 24_Kashish Ahuja
 * Program for HashSet using iterator interface
 */
import java.util.*;

class HashSetIterator {

    
    static public void main (String...args) {
        HashSet s=new HashSet(); 
	s.add(1);  
	s.add("Kash");  
	s.add(1.25f);  
	s.add(6.289);  
	s.add(true);  
 
        Iterator i=s.iterator();  
        while(i.hasNext())  
        {  
           System.out.println(i.next());  
        }  
    }
}
