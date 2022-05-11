import java.util.*;

class TreeSetIterator {
    public static void main(String[] args) {

        TreeSet s = new TreeSet();

        // Using the add() method
        s.add(1);  
	s.add(3);  
	s.add(10);  
	s.add(8);  
	s.add(6);  
 
        Iterator iterator = s.iterator();  
	while (iterator.hasNext()) {   
            System.out.println(iterator.next());  
	}  

    }
}
