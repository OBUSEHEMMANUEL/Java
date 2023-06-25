package femi.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {5,4,2,7,3};
//        System.out.println(Arrays.toString(ascendingOrder(array)));
        System.out.println(Arrays.toString(reverseArray(array)));
    }
    public static int[] ascendingOrder(int[] array) {
     int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }
    public static int[] reverseArray(int[] array){
        int[] arr = new int[array.length];
        int temp = 0;
        for (int i = array.length-1; i >=0; i--) {
            arr[temp] = array[i];
          temp++;
        }
        return arr;
    }

}

