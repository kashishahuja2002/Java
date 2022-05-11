/**
 * @author 24_Kashish Ahuja
 * Program for ArrayList using for each loop
 */
import java.util.*;

class ArrayListForEach {
    
    
    static public void main (String...args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();  
	arrlist.add(15);  
	arrlist.add(05);  
	arrlist.add(2002);  
	arrlist.add(19);

	for(Integer data : arrlist) {
            System.out.println(data);
        }
    }
}
