package Deitel.chapter_17.examples;

import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2,4,5,6,7,8,9);
        stream.peek(System.out::print)
                .forEach(System.out::println);
    }
}
