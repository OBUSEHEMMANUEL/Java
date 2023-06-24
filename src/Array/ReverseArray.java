package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        System.out.println(Arrays.toString(array));
//        reverse(array);
//        System.out.println(Arrays.toString(array));
        int[] array ={1,2,3,3,4,5,6,7,8};
//       boolean print = splitArray(array);
//        System.out.println(print);
        System.out.println(Arrays.toString(reverse(array)));
    }
    public static int[] reverse(int[] number){
//        int temp;
//        int index = (number.length-1);
//        int halfArray = number.length/2;
        int[] reversedArray = new int[number.length];
        for (int i = 0; i < number.length; i++) {
          reversedArray[number.length-1-i] = number[i];
        }
        return reversedArray;
    }
    public static boolean spiltArray(int[] array) {
        int[] array1 = new int[array.length/2];
        int[] array2 = new int[array.length/2];
        boolean validation = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    array1[i] = array[i];

                }
                if (array[i] == array[j]) {
                    array2[i] = array[j];
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
    public static boolean splitArray(int[] array) {
        int countDuplicates = 0;

        for (int i = 0; i < array.length; i++) {
            boolean foundDuplicate = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (foundDuplicate) {
                countDuplicates++;
            }
        }

        return countDuplicates >= 3;
    }
}

