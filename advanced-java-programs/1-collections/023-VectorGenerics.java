
import java.util.*;

class VectorGenerics {
  
    
    static public void main (String...args) {
        Vector<String> v = new Vector<>();  
	v.add("Kashish");  
	v.add("Ahuja");  
	v.add("Kash");  
	v.add("Mini");  
	v.add("Min");  

	Iterator<String> iterator = v.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
