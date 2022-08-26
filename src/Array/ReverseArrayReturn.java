package Array;

import java.util.Arrays;

public class ReverseArrayReturn {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }


    public static String reverse(int[] number){
        int save = 0;

        int  temp = 0;
        int index = number.length-1;
        int halfArray = number.length/2;
        for (int i = 0; i < halfArray; i++) {
            temp = number[i];
            number[i]= number[index -i];
            number[index - i] = temp;
            save = number[index - i];

        }
        return String.format(String.valueOf(save));
    }

}
