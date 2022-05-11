/**
 * @author 24_Kashish Ahuja
 * Program for Vector Methods
 */
import java.util.*;

class ArrayListMethods {

    
    static public void main (String...args) {
        ArrayList al=new ArrayList();  
        al.add(1);  
	al.add("Kashish");  
	al.add(1.25f);  
	al.add(true);  
	al.add(26.5486);	
        al.add("Mini");
        System.out.println(al);  
        
        System.out.println("\nList contains value \"Kashish\"?: "+ al.contains("Kashish"));
        
        System.out.println("\nIndex of \"Kashish\": "+ al.indexOf("Kashish"));
        
        System.out.println("\nList size: "+ al.size());
        
   
    }
}
