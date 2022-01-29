package collection;

import java.util.LinkedList;
import java.util.Queue;



public class SingleQueueApp {
    public static void main(String[] args) {

     Queue<String> queue = new LinkedList<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Mukhtar"));
        System.out.println(queue.offer("Nashir"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }

}
