import java.util.*;

class VectorSet {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // add elements in the array list
    languages.add("K");
    languages.add("A");
    languages.add("A");
languages.add("H");
    System.out.println(languages);

    // change the element of the array list
    languages.set(2, "S");
    System.out.println("Modified vector: " + languages);
  }
}