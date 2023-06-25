package Array;

import Deitel.chapter_7.Array;

import java.util.*;

public class Semicolon {
    public static void main(String[] args) {
//        Integer[] numbers = {1,2,3,4,5,6};
//
//        printNumbers(numbers);
//
//    }
//
//    public static String printNumbers(Integer... nums){
//        System.out.println(Arrays.toString(nums));
//
//
//        Collections.frequency()
//
//    }

        String[] colors = {"yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        System.out.print("sorted set: " + tree);

        printOut(tree);

    }

    public static   void printOut(SortedSet<String > tree){
        System.out.println();
        for (String s:tree) {

            System.out.print(s + " ");
        }
    }
}