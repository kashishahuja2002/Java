import java.util.TreeSet;

class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Floor: " + numbers.floor(4));

    }
}
