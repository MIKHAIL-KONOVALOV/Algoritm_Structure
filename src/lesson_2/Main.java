package lesson_2;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Mihail
 * Created on 28.04.2020
 */
public class Main {

    public static final int BOUND = 1000;
    public static final int ARRAY_SIZE = 1_00_000;

    public static void main(String[] args) {
        Array arr1 = new ArrayImplementation(ARRAY_SIZE);
        Array arr2 = new ArrayImplementation(ARRAY_SIZE);
        Array arr3 = new ArrayImplementation(ARRAY_SIZE);


        initRndArrays(arr1,arr2,arr3);
        measureTime(arr1::sortBubble,"Сортировка пузырьком");
        measureTime(arr2::sortSelect,"Сортировка выбором");
        measureTime(arr3::sortInsert,"Сортировка вставкой");
    }

    public static void initRndArrays(Array... arrays) {
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            int randomValue = random.nextInt(BOUND);
            for (Array array : arrays) {
                array.add(randomValue);
            }

        }
    }

    public static void measureTime(Runnable action, String sortName){
        long currentTime = System.currentTimeMillis();
        action.run();
        System.out.println(sortName + ": время сотировки  = " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() -
                currentTime) + " секунд");
    }
}
