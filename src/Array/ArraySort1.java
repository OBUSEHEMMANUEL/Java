package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort1 {
    static Scanner scanner = new Scanner(System.in);
    public static void inputNumbers(int []arrayNumber){
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.printf("Enter number %d:", (i + 1));
             int input = scanner.nextInt();
             arrayNumber[i] = input;
        }
    }

    public void sortArray(int[] arrayNumbers){
        int temp = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i+1; j < arrayNumbers.length; j++) {
                if(arrayNumbers[i] > arrayNumbers[j]){
                     temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
