package Deitel.chapter_17.excercise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SummingTriples {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10};

        IntStream.of(array).filter(i->i%2==0).map((digit)->digit+digit+digit).forEach(System.out::println);
    }
}
