package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    static Scanner scanner = new Scanner(System.in);
    public static void inputDigits(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("ENTER NUMBER"+ (i+1)+":");
            int input = scanner.nextInt();
            array[i] = input;
        }
    }
    public static void sort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i] > array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
