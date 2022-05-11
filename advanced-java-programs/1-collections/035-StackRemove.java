import java.util.Stack;

class StackRemove {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Remove element stacks
        String ele = animals.pop();
        System.out.println("After removing element: " + animals);
System.out.println("Removed element: " + ele);
    }
}
