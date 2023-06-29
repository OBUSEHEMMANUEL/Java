package Deitel.chapter_17.examples;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
List<Integer> numbers = List.of(1,2,3,1);
//var result = numbers.stream().map((n)->n*2)
//                .reduce(1,(i,j)->i*j);
//        System.out.println(result);


        System.out.println(numbers.stream()
                        .filter((n)->n%2 != 0)
                .mapToInt((n) -> n * 2)
                .sum());
    }
//    public static Stream<Integer> getIntStream(){
//
//    }
}
