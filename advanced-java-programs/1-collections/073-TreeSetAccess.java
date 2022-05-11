import java.util.TreeSet;

class TreeSetAccess{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        System.out.println("First element: " + numbers.first());

        // Using the last() method
        System.out.println("Last element: " + numbers.last());
    }
}
