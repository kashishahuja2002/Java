import java.util.*;

class LinkedHashMapReplace{
  public static void main(String[] args) {

    LinkedHashMap<Integer, String> languages = new LinkedHashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "C");
    System.out.println("Original LinkedHashMap: " + languages);

    // change element with key 2
    languages.replace(2, "C++");
    System.out.println("Updated LinkedHashMap: " + languages);
  }
}