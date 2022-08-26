package Array;

import static Array.ArrayShuffle.shuffle;
import static Array.ArraySort1.inputNumbers;

public class ArraySortMain {
    public static void main(String[] args) {
        ArraySort1  arraySort1 = new ArraySort1();
        int [] array = new int [6];
        System.out.println("populating Array");
        inputNumbers(array);
        System.out.println("Sorting Array");
        arraySort1.sortArray(array);
        System.out.println("Shuffling Array");
        shuffle(array);
    }
}
