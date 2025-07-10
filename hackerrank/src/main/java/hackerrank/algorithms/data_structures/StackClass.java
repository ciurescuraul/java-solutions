package hackerrank.algorithms.data_structures;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(6);
        stack.push(3);
        stack.push(9);
        stack.push(8);

        Integer peek = stack.peek();
        Integer first = stack.getFirst();
        System.out.println(first);
        System.out.println(peek);

        stack.forEach(System.out::println);

    }
}
