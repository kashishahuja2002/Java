import java.util.HashMap;

class HashMapAccess{
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "C");
    System.out.println("HashMap: " + languages);

    // get() method to get value
    String value = languages.get(1);
    System.out.println("Value at index 1: " + value);
System.out.println("Keys: " + languages.keySet());

    System.out.println("Values: " + languages.values());

    System.out.println("Key/Value mappings: " + languages.entrySet());
  }
}