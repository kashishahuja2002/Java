import java.util.ArrayDeque;

class ArrayDequeRemove {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using remove()
        System.out.println("After removing: " + animals.remove());


        // Using removeFirst()
        System.out.println("Removed First Element: " + animals.removeFirst());

        // Using removeLast()
        System.out.println("Removed Last Element: " +animals.removeLast());
    }
}
