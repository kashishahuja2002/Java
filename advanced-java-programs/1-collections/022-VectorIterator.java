
import java.util.*;

class VectorIterator {
  
    static public void main (String...args) {
        Vector v = new Vector();  
	v.add(1);  
	v.add("Kash");  
	v.add(1.25f);  
	v.add(6.289);  
	v.add(true);  

	Iterator iterator = v.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  
    }
}
