package Deitel.chapter_17.textbookExample.Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
//        System.out.println(IntStream.rangeClosed(1, 10).sum());

        System.out.println(IntStream.rangeClosed(1, 10).map((int x) -> x * 2
        ).sum());
    }
}
