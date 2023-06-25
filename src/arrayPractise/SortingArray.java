package arrayPractise;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
    int[] array = {2,3,1,5,4,3};
        System.out.println(Arrays.toString(sortArray(array)));
    }
    public static int[] sortArray(int[] array){
        int temp =0;
        int[] num = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            }
            }
  num[i] =array[i];
        }
        return num;

    }
}
