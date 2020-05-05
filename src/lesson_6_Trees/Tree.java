package lesson_6_Trees;

/**
 * @author Mihail
 * Created on 03.05.2020
 * <p>
 * This interface ...
 */

public interface Tree {

    void add(int value);

    boolean remove(int value);

    boolean find(int value);

    int getSize();

    boolean isEmpty();

}
