package Array;

import java.util.Arrays;

public class ArrayOfNumbers{
    static int[] array = {3,3,1,5,4,3};

    public static void main(String[] args) {
//        removeOneIndexAndAddTheRestMax();
//        removeOneIndexAndAddTheRestMin();
//        arrayNumberMax(array);
//        arrayNumberMin(array);
        System.out.println(Arrays.toString(removeOneIndexAndAddTheRest(array)));


    }

    public static int arrayNumberMax(int[] number){
        int max = Integer.MIN_VALUE;;
        for (int i = 0; i < number.length; i++) {
            if(number[i] > max){
                 max = number[i];
            }
        }
        System.out.println("The largest number is " + max);
        return max;
    }
    public static int arrayNumberMin(int[] number) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

        }
        System.out.println("The smallest number is " + min);

        return min;
    }
//    public static int [] removeOneIndexAndAddTheRest(int[] number){
//        int total =0;
//        int count = 0;
//        int[] totals = new int[number.length];
//
//        for (int i = 0;  i < number.length; i++) {
//            total += i;
//        }
//        for (int j = 0; j < number.length; j++) {
//            totals[j] = total - j;
//        }
//        return totals;
//    }
    public static int[] removeOneIndexAndAddTheRest(int[] array){
        int[] totals = new int[array.length];
        int total;
        for (int i = 0; i < array.length; i++) {
            total=0;
            for (int j = 0; j < array.length; j++) {
                if (i!=j){
                    total+=array[j];
                }

            }
            totals[i] = total;
        }
        return totals;
    }
    public static int removeOneIndexAndAddTheRestMax(){
        return arrayNumberMax(removeOneIndexAndAddTheRest(array));
    }

    public static int removeOneIndexAndAddTheRestMin(){
        return arrayNumberMin(removeOneIndexAndAddTheRest(array));
    }
}
