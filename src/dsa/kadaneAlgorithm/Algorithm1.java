package dsa.kadaneAlgorithm;

import java.util.Arrays;

public class Algorithm1 {
    public static void main(String[] args) {
      int[] num = {1,-3,2,1,-2};
//      int[][] num1 ={{1,2,3},{4,5,6},{7,8,9}};
//      int[][] num2 = {{1,2},{3,4}};

//      int[] x = {84,85,86,87,85,90,85,90,23,45};
        System.out.println("Global sum = "+kadane(num));
//        middle(num);

//      diagonal(num);
//        int[] y = {1,1,3,3,3,4,4,4,4,4,5,6,7,8};
//        list1(x);
//        System.out.println(Arrays.toString(duplicatedNumber(y)));

    }

    public static int[] duplicatedNumber(int[] array){
        if(array.length==0 || array.length==1){
            return array;
        }
        int count = 0;
        int[] temp = new int[array.length/2];
        int j=0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]!=array[i+1]){
               temp[j++] = array[i];
               count++;
            }

        }

        temp[j] = array[array.length-1];

       return temp;
    }

    public static void list(int[] array) {
        int high = array[0];
        int secondHigh = array[0];
        for (int i = 0; i < array.length; i++) {
            if (high <= array[i]) {
                secondHigh = high;
                high = array[i];
//            }else if (array[i] > secondHigh){
//                secondHigh = array[i];
//            }
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > secondHigh && array[j]< high) {
//                    secondHigh = array[j];
//                }
//            }

            }
            System.out.println("Highest number: " + high + " secondHighest: " + secondHigh);
        }
    }

    public static void list1(int[] array) {
        int temp =0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
            System.out.println(array[i]);

        }


    }
    public static int kadane(int[] array){
        int globalSum = array[0];
        int curSum = array[0];

        for (int i = 0; i < array.length; i++) {
            curSum += array[i];
            if (curSum < array[i])
                curSum = array[i];
            if (curSum > globalSum)
                globalSum = curSum;
        }
        return globalSum;

    }
    public static void middle(int[] array){
        int[] num ={};
        for (int i = 1; i < array.length-1; i++) {
//            num = array[i];

        }
    }
    public static void diagonal(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
              sum +=array[i][j];
            }
        }
        System.out.println(sum);

    }




}
