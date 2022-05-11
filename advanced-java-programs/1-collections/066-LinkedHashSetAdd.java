import java.util.*;

class LinkedHashSetAdd {
    public static void main(String[] args) {
       	LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

         LinkedHashSet<Integer> numbers = new  LinkedHashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New Set: " + numbers);
    }
}
