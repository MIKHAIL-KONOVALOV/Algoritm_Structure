package lesson_3_stack_queue;

/**
 * @author Mihail
 * Created on 02.05.2020
 * <p>
 * This interface ...
 */

public interface Stack {
    void push(int value);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
    int getSize();
}
