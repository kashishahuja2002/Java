/**
 * @author 24_Kashish Ahuja
 * Program for LinkedList methods
 */
import java.util.*;

class LinkedListMethods {

    static public void main (String...args) {
        LinkedList linklist=new LinkedList();  
        linklist.add(1);  
	linklist.add("Kashish");  
	linklist.add(1.25f);  
	linklist.add(true); 
        System.out.println(linklist);  
        
        System.out.println("\nList contains value \"Kashish\"?: "+ linklist.contains("Kashish"));
        
        System.out.println("\nIndex of \"Kashish\": "+ linklist.indexOf("Kashish"));
      
        
        System.out.println("\nNumber of elements in list: "+ linklist.size());
        
    }
}
