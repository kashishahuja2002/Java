import java.util.ArrayDeque;

class ArrayDequePoll {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using poll()
        System.out.println("After removing: " + animals.poll());

        // Using pollFirst()
        System.out.println("Removed First Element: " + animals.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + animals.pollLast());
    }
}
