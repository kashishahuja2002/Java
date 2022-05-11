import java.util.PriorityQueue;

class PriorityQueueInsert {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("Priority Queue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated Queue: " + numbers);
    }
}
