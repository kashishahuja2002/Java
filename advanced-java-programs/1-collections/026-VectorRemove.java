
import java.util.*;

class VectorRemove {
  public static void main(String...args) {
    ArrayList<String> animals = new ArrayList<>();

    animals.add("K");
    animals.add("A");
    animals.add("S");

    animals.add("H");
    animals.add("I");
    System.out.println(animals);

    animals.remove(1);
    System.out.println("After removing 1st item: " + animals);
animals.remove("S");
System.out.println("After removing S: " + animals);
animals.clear();
System.out.println("After clearing list: " + animals);
System.out.println("List empty? " + animals.isEmpty());
    
  }
}
