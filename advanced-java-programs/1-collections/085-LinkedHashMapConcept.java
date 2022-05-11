import java.util.*;

class LinkedHashMapConcept {
    public static void main(String[] args) {

        LinkedHashMap s = new LinkedHashMap();

        // Using the add() method
        s.put(1,"K");  
	s.put(3,56);  
	s.put(10,1.25f);  
	s.put(8,true);  
	s.put(6,6.289);  
 
        System.out.println("LinkedHashMap: " + s);

    }
}
