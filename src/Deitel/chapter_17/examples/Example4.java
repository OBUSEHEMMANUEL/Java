package Deitel.chapter_17.examples;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        numbers.stream().mapToInt((n)->n+1).
                        mapToObj((n)->n).
                        forEach((n)-> System.out.println(n));
    }
}
