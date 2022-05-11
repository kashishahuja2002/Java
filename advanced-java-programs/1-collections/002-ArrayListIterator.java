/**
 * @author 24_Kashish Ahuja
 * Program for ArrayList using iterator interface
 */
import java.util.*;

class ArrayListIterator {
   
    
    static public void main (String...args) {
        ArrayList arrlist = new ArrayList();  
	arrlist.add(1);  
	arrlist.add("Kash");  
	arrlist.add(1.25f);  
	arrlist.add(6.289);  
	arrlist.add(true);  

	Iterator iterator = arrlist.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
