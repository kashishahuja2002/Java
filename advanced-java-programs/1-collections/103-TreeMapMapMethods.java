import java.util.TreeMap;

class TreeMapMapMethods {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing headMap() Method:");
        System.out.println("Without boolean value: " + numbers.headMap("Fourth"));
        System.out.println("With boolean value: " + numbers.headMap("Fourth", true));

	System.out.println("\nUsing tailMap() Method:");
        System.out.println("Without boolean value: " + numbers.tailMap("Second"));
        System.out.println("With boolean value: " + numbers.tailMap("Second", false));

	System.out.println("\nUsing subMap() Method:");
        System.out.println("Without boolean value: " + numbers.subMap("Fourth", "Third"));
        System.out.println("With boolean value: " + numbers.subMap("Fourth", false, "Third", true));

    }
}

