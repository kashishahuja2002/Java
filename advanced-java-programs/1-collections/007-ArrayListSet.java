import java.util.ArrayList;

class ArrayListSet {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // add elements in the array list
    languages.add("K");
    languages.add("A");
    languages.add("A");
languages.add("H");
    System.out.println("ArrayList: " + languages);

    // change the element of the array list
    languages.set(2, "S");
    System.out.println("Modified ArrayList: " + languages);
  }
}