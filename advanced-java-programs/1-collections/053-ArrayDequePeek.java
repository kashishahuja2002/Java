import java.util.ArrayDeque;

class ArrayDequePeek {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement = animals.peekFirst();
        System.out.println("First Element: " + firstElement);

        // Using peekLast
        String lastElement = animals.peekLast();
        System.out.println("Last Element: " + lastElement);
    }
}
