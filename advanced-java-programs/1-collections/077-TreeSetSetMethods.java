import java.util.TreeSet;

class TreeSetSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using headSet() with default boolean value
        System.out.println("HeadSet without boolean: " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("HeadSet with boolean: " + numbers.headSet(5, true));
	  
 // Using tailSet() with default boolean value
        System.out.println("TailSet without boolean: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("TailSet with boolean: " + numbers.tailSet(4, false));
        
	  // Using subSet() with default boolean value
        System.out.println("SubSet without boolean: " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("SubSet with boolean: " + numbers.subSet(4, false, 6, true));
    }
}
