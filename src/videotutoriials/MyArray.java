package videotutoriials;

import java.util.Scanner;

public class MyArray {
   private static Scanner  input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myintegers = getIntegers(5);
        System.out.println("VALUES");
            for (int i = 0; i < myintegers.length; i++){

                System.out.println("Element " + (1+i) +", Numbers " + myintegers[i]);

            }
        System.out.println("The average is : " + getTotalAverage(myintegers));
            }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number +", integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++ ){
            values[i] =input.nextInt();

        }
        return values;
    }
    public static double  getTotalAverage(int [] myArray){
        int total = 0;
        for (int i = 0; i < myArray.length; i++){
            total += myArray[i];
        }
        return (double) total/ (double) myArray.length;

    }
}
