 package com.timbachuk.com.timbachuk;

import java.util.Scanner;

public class MinElementChallenge {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
       int [] numbers = readInteger(count) ;
        findMin(numbers );
    }
    public static int[] readInteger(int  count){
        int [] read =new int[count];
        for (int i = 0; i < read.length; i++) {
            System.out.println("Enter number "+ (i+1) + ":" );
          int  numbers = scanner.nextInt();
          read[i] = numbers;
        }
        return read;
    }
    public static void findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
             min = array[i];
            }

        }

        System.out.println("THE MINIMUM NUMBER IS: " + min);
    }
}
