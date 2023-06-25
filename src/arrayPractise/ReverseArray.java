package arrayPractise;

import java.util.Arrays;
//6/20/2023
public class ReverseArray {

    public static void main(String[] args) {
        int[] array ={1,2,3,3,4,5,6,7,8,4,3,4,0};
        System.out.println(Arrays.toString(reversedArray(array)));
    }
    public static int[] reversedArray(int[] array){
        int[] reversedArray= new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length-1-i]=array[i];
        }
        return reversedArray;
    }
}
