import java.util.TreeSet;

class TreeSetAdd {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
       

        // Using the addAll() method
        numbers.addAll(evenNumbers);
 numbers.add(1);
        System.out.println("New TreeSet: " + numbers);
    }
}
