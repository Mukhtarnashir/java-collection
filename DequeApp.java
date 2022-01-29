package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("PONDOK");
        stack.offerLast("KHAS");
        stack.offerLast("KEMPEK");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("PONDOK"); 
        deque.offerFirst("KHAS");
        deque.offerFirst("KEMPEK");

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
    }

}
