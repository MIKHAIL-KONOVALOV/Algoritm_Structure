package lesson_2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Mihail
 * Created on 28.04.2020
 */
public class Main {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 1_00_000;
        Array arr1 = new ArrayImplementation(ARRAY_SIZE);
        Array arr2 = new ArrayImplementation(ARRAY_SIZE);
        Array arr3 = new ArrayImplementation(ARRAY_SIZE);

        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            int randomValue = random.nextInt(1000);
            arr1.add(randomValue);
            arr2.add(randomValue);
            arr3.add(randomValue);
        }
        testBubble(arr1);
        testSelect(arr2);
        testInsert(arr3);
    }

    public static void testBubble(Array array) {
        long currentTime = System.currentTimeMillis();
        array.sortBubble();
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() -
                currentTime));
    }

    public static void testSelect(Array array) {
        long currentTime = System.currentTimeMillis();
        array.sortSelect();
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() -
                currentTime));
    }

    public static void testInsert(Array array) {
        long currentTime = System.currentTimeMillis();
        array.sortInsert();
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() -
                currentTime));
    }
}
