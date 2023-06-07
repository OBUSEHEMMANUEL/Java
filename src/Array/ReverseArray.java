package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        System.out.println(Arrays.toString(array));
//        reverse(array);
//        System.out.println(Arrays.toString(array));
        int[] array ={1,2,3,3,4,5,6,7};
      // boolean print = spiltArray(array);
       // System.out.println(print);
        System.out.println(Arrays.toString(reverse(array)));
    }
    public static int[] reverse(int[] number){
        int temp;
        int index = (number.length-1);
        int halfArray = number.length/2;
        for (int i = 0; i < halfArray; i++) {
            temp = number[i];
            number[i] = number[index-i];
           number[index-i] = temp;
        }
        return number;
    }
    public static boolean spiltArray(int[] array) {
        int[] array1 = new int[array.length];
        int[] array2 = new int[array.length];
        boolean validation = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    array1[i] = array[i];

                }
                if (array[i] == array[j]) {
                    array2[i] = array[j+1];
                }
                if (array2.length >= 3) {
                    validation = true;
                } else {
                    validation = false;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        return validation;
    }
}

