package Deitel.chapter_7;

import java.util.Scanner;

public class ArraySort {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myArray = new int[6];
        arraySort(myArray);
    }
    public static void arraySort (int[] array){
        int temp = 0;

        int[] values = new int[array.length];
        System.out.println("Enter " + array.length + " values");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
            System.out.println(values[i]);
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int j = 0; j < values.length; i++) {
                    if (values[i] < values[j]) {
                        temp = values[i];
                        values[i] = values[j];
                        values[j] = temp;
                        flag = true;
                    }

                        System.out.println(values[i] + " ");
                }
            }


            }

        }
    }






