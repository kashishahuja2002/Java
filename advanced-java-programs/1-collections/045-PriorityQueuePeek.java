import java.util.PriorityQueue;

class PriorityQueuePeek{
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("Queue: " + numbers);

        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Element: " + number);
    }
}
