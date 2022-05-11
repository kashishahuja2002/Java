
import java.util.*;

class VectorMethods {

    
    static public void main (String...args) {
        Vector v=new Vector();  
        v.add(1);  
	v.add("Kashish");  
	v.add(1.25f);  
	v.add(true); 
        System.out.println(v);  
        
        System.out.println("\nList contains value \"Kashish\"?: "+ v.contains("Kashish"));
        
        System.out.println("\nIndex of \"Kashish\": "+ v.indexOf("Kashish"));
      
        
        System.out.println("\nVector size: "+ v.size());
    }
}
