import java.util.PriorityQueue;

class PriorityQueueRemove{
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the remove() method
numbers.remove(2);
System.out.println("After removing: " + numbers);

        // Using the poll() method
        numbers.poll();
System.out.println("After removing head element: " + numbers);
    }
}
