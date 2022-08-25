package Array;

import java.util.Arrays;
import java.util.Random;
public class ArrayShuffle {

    public static void shuffle(int[] array){
        int temp = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           int swap = random.nextInt(array.length);
           temp = array[swap];
            array[swap] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
