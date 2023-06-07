package Deitel.chapter_17.examples;

import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.skip(3)
                .filter(n-> n>3)
                .forEach(System.out::println);
    }
}
