package arrayPractise;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] array = {2,3,1,5,4,3,7,8,9,5,-1,-8};
        System.out.println(maximum(array));
    }
    public static int minimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {

        if(array[i]<min){
        min = array[i];
    }
        }
        return min;
    }
    public static int maximum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];

            }
        }
        return max;
    }
}
