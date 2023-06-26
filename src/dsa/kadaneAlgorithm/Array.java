package dsa.kadaneAlgorithm;

import com.classwork.work.ArrayList;

import java.util.Arrays;

public class Array {
    private int[] number;
    private int count;

    public Array(int length) {
        number = new int[length];

    }

    public void insert(int digit){

       if (number.length == count) {
           int[] newNumber = new int[count*2];
           for (int i = 0; i < count; i++) {
               newNumber[i] = number[i];
           }
           number = newNumber;
       }
        number[count++] = digit;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(number[i]);
        }
    }
    public  void removeAt(int index){
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i <  count; i++) {
            number[i] = number[i + 1];
        }
        count--;

    }
    public int indexOf(int digit){
        int num = -1;
        for (int i = 0; i < count; i++) {
            if (number[i] == digit) {
                num = i;

            }
        }
            return  num;
    }

    }

