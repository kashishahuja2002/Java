import java.util.*;
import java.util.Map.Entry;

class LinkedHashMapForEach{
  public static void main(String[] args) {

    // create a HashMap
    LinkedHashMap<Integer, String> languages = new LinkedHashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "C");
    System.out.println("LinkedHashMap: " + languages);

    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }

    // iterate through values only
    System.out.print("\nValues: ");
    for (String value : languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }
    
    // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (Entry entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
  }
}