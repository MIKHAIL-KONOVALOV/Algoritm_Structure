package lesson_3_stack_queue;

/**
 * @author Mihail
 * Created on 02.05.2020
 */
public class StackImplementation implements Stack {
    private int[] data;
    private int size;

    public StackImplementation(int maxSize) {
        this.data = new int[maxSize];
    }

    @Override
    public void push(int value) {
        data[size++] = value;
    }

    @Override
    public int pop() {
        return data[--size];
    }

    @Override
    public int peek() {
        return isEmpty() ? -1 : data[size -1 ];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
