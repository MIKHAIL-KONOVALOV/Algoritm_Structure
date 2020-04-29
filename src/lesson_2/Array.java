package lesson_2;

/**
 * @author Mihail
 * Created on 28.04.2020
 * <p>
 * This interface ...
 */

public interface Array {

    void add(int value);

    int get();

    int get(int index);

    int indexOf(int value);

    boolean contains(int value);

    boolean remove(int value);

    boolean remove();

    boolean isEmpty();

    int getSize();

    void display();

    void clear();

    void sortBubble();

    void sortSelect();

    void sortInsert();
}
