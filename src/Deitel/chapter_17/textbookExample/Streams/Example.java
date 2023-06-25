package Deitel.chapter_17.textbookExample.Streams;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        System.out.println(IntStream.iterate(1, x -> x + 1)
                .map((x) -> x * x).
                limit(10).sum());


    }
}
