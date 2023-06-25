package Deitel.chapter_17.excercise;

import com.classwork.work.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassAverage {
    public static void main(String[] args) {
//int[] digit = {45,34,56,78,98,30};

        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(45);

        Double avg = list.stream().mapToInt(n -> n).average().getAsDouble();
        System.out.println(avg);



    }
}
