/**
 * @author 24_Kashish Ahuja
 * Program for ArrayList with generics
 */
import java.util.*;

class ArrayListGenerics {
    
    static public void main (String...args) {
        ArrayList<String> arrlist = new ArrayList<String>();  
	arrlist.add("Kashish");  
	arrlist.add("Ahuja");  
	arrlist.add("Kash");  
	arrlist.add("Mini");  
	arrlist.add("Min");  

	Iterator<String> iterator = arrlist.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
