package Array;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {5,4,2,7,3};
        unsortedArray(array);
    }
  public static void unsortedArray(int[] array){
      int temp = 0;
      for (int i = 0; i < array.length; i++) {
              for (int j = i + 1; j < array.length; j++) {
                  if(array[i] > array[j]){
                      temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;

                  }

              }
          System.out.printf("Array number is: %d%n", array[i]);
          }
      }




  }



