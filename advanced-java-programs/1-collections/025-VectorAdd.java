
import java.util.*;

class VectorAdd {
    
    static public void main (String...args) {
        Vector linklist=new Vector();  
        linklist.add(1);  
	linklist.add("Kashish");  
	linklist.add(1.25f);  
	linklist.add(true);  
        System.out.println(linklist);  

linklist.add("Mini");  
        System.out.println("\nAfter adding element: "+linklist); 
        
        linklist.add(2,"new element");
        System.out.println("\nAfter adding element on 2nd index: "+ linklist);
        
        
        
    }
}
