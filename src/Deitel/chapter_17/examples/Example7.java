package Deitel.chapter_17.examples;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,22,3,4,3,4,5,6,7);
        list.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
