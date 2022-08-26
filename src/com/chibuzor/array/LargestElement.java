package com.chibuzor.array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {2,5,7,9,3,4,1};
       // System.out.println(largestElement1(array));
        //reverse(array);
       String[] list ={"a","b","c"};
       int[] list2 = {1,2,3};
//        System.out.println(oddPosition3(array));
//        evenPosition4(array);
//        total5(array);
//        sum6(array);
      System.out.println(Arrays.toString(concatenate7(list, list2)));
//
//        System.out.println( elementOccur8(array,5));
        System.out.println(Arrays.toString(reverse1(array)));
    }

    public static int largestElement1(int[] number){
        int temp =0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
               // temp = max;

            }

        }
        return max;

    }
    public static int [] reverse1(int[] number){
        int[] reverse = new int[number.length];
         int count = 0;
            for (int i = number.length -1; i >= 0; i--) {
                reverse[count] = number[i];
            count++;
        }
        return reverse;
    }

    public static int [] reverse2(int[] number){
        int temp = 0;
        int index = (number.length-1);
        int halfArray = number.length/2;
        for (int i = 0; i < halfArray; i++) {
            temp = number[i];
            number[i] = number[index-i];
            number[index-i] = temp;
        }
        return number;
    }
    public static int[] oddPosition3(int[] number){
        int count =0;
        for (int i = 0; i < number.length; i++) {
            if(i % 2 != 0){
               number[count]= number[i];
            }
        }
        return number;
    }
    public static void evenPosition4(int[] number){
        System.out.println("EVEN NUMBER POSITION");
        System.out.printf("%s  %10s","Index","Element");
        for (int i = 0; i < number.length; i++) {
            if(i % 2 ==0){
                System.out.printf("%n%2d %10d%n ",i,number[i]);
            }

        }
    }
    public static void total5(int[] number){
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        System.out.println("The total of the Array Element:" + total);
    }
    public static void sum6(int[] number){
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        System.out.println("The total of the Array Element:" + total);

        int counter = 0;
        int total1 = 0;
        while (counter < number.length){
            total1 += number[counter];
            counter++;
        }
        System.out.println("The total of the Array Element:" + total);

        int counter1 = 0;
        int total2 = 0;
        do{
            total2 += number[counter1];
            counter1++;
        }while (counter1 < number.length);
        System.out.println("The total of the Array Element:" + total);
    }
    public static String [] concatenate7(String[] list, int[] list2){
        int count = 0;
        String [] newArray = new String[list.length + list2.length];
        for(int i = 0; i < list.length; i++) {
            newArray[count] = list[i];
            count++;
        }
        for(int j = 0; j < list2.length; j++) {
            newArray[count] = String.valueOf(list2[j]);
            count++;
        }
        return newArray;
    }
    public static boolean elementOccur8(int[] list, int element) {
        for (int i = 0; i < list.length; i++) {
                if (list[i] == element ){
                    return true;
            }
        }
        return false;
    }
}
