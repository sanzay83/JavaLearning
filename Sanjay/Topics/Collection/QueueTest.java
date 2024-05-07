package Sanjay.Topics.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);

        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());
        //System.out.println(queue.remove());
        System.out.println(queue.poll());
    }
}
