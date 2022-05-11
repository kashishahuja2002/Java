import java.util.*;
import java.util.Map.Entry;

class TreeMapForEach{
  public static void main(String[] args) {

    TreeMap<Integer, String> languages = new TreeMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "C");
    System.out.println("TreeMap: " + languages);

    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : languages.keySet()) {
      System.out.print(key+" ");
    }

    // iterate through values only
    System.out.print("\nValues: ");
    for (String value : languages.values()) {
      System.out.print(value+" ");
    }
    
    // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (Entry entry : languages.entrySet()) {
      System.out.print(entry+" ");
    }
  }
}