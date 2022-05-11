
import java.util.*;

class VectorForEach {

    static public void main (String...args) {
        Vector<Integer> v = new Vector<Integer>();  
	v.add(15);  
	v.add(05);  
	v.add(2002);  
	v.add(19);

	for(Integer data : v) {
            System.out.println(data);
        }
    }
}
