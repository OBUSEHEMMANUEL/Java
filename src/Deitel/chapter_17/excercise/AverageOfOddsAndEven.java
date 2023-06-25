package Deitel.chapter_17.excercise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AverageOfOddsAndEven {
    public static void main(String[] args) {

int[] array1 = {1,2,3,4,5,6,7,8,9};
//sort(array1);
        System.out.print(IntStream.of(array1).filter(x -> x % 2 == 0).average().getAsDouble());
        System.out.println();

        System.out.print(IntStream.of(array1).filter(y -> y % 2 != 0).average().getAsDouble());
    }
    public static void sort(int[] digits) {
        int[] array = new int[digits.length];

        int[] array2 = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                array[i] = digits[i];
            } else {
                array2[i] = digits[i];
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(array2));
    }

}
