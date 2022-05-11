/**
 * @author 24_Kashish Ahuja
 * Program for ArrayList sorting
 */
import java.util.*;

class ArrayListSorting {
   
    
    static public void main (String...args) {
        ArrayList<String> arrlist1=new ArrayList<>();  
        arrlist1.add("Mango");  
        arrlist1.add("Apple");  
        arrlist1.add("Banana");  
        arrlist1.add("Grapes");  
        Collections.sort(arrlist1); 
        System.out.println("Sorted list: "+ arrlist1);  

        ArrayList<Integer> arrlist2=new ArrayList<>();  
        arrlist2.add(21);  
        arrlist2.add(11);  
        arrlist2.add(51);  
        arrlist2.add(1);  
        Collections.sort(arrlist2);
        System.out.println("Sorted list: "+ arrlist2);  
    }
}
