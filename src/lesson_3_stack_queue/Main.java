package lesson_3_stack_queue;

import lesson_3_stack_queue.Stack;
import lesson_3_stack_queue.StackImplementation;

/**
 * @author Mihail
 * Created on 03.05.2020
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new StackImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
