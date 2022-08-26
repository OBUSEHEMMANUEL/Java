package Deitel.chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class MyIntArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myArray = new int[25];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i * 10;
//
//
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);

        }

    }
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", MyArray " + array[i]);
//        }
//    }
    public static int[] getIntegers(int number){
        System.out.println("ENTER " + number +" int Values.\r");
        int[] values = new int[number];
        for(int i =0; i< values.length; i++){
            values[i] = input.nextInt();
        }
        return values;
    }

}