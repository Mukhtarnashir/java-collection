package collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Pondok");
        stack.push("Khas");
        stack.push("Kempek");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }
    }

}
