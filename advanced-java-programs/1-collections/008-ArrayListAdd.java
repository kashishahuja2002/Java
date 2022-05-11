/**
 * @author 24_Kashish Ahuja
 */
import java.util.*;

class ArrayListAdd {

    
    static public void main (String...args) {
        ArrayList al=new ArrayList();  
        al.add(1);  
	al.add("Kashish");  
	al.add(1.25f);  
	al.add(true);  
        
        System.out.println(al);

al.add("Mini");  
 System.out.println("\nAfter adding element: "+ al);
        
        al.add(2,"new element");
        System.out.println("\nAfter adding element on 2nd index: "+ al);
        
     
    }
}
