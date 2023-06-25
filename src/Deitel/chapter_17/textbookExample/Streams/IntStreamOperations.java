package Deitel.chapter_17.textbookExample.Streams;

import fairtaxcalculator.Product;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values ={3,10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.println("originial values");
        System.out.println(IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

        System.out.println("COUNT");
        System.out.println(IntStream.of(values).count());

        System.out.println("ADD");
        System.out.println(IntStream.of(values).sum());

        System.out.println("MIN");
        System.out.println(IntStream.of(values).min().getAsInt());

        System.out.println("MAX");
        System.out.println(IntStream.of(values).max().getAsInt());

        System.out.println("AVERAGE");
        System.out.println(IntStream.of(values).average().getAsDouble());

        System.out.println("SUM");

        System.out.println(IntStream.of(values).reduce(0, Integer::sum));

        System.out.println("PRODUCT");
        System.out.println(IntStream.of(values).reduce( (x, y) -> x * y).getAsInt());

        System.out.println("SORTED ORDER");
        System.out.println(IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println("SUMMARY STATISTICS");
        System.out.println(IntStream.of(values).summaryStatistics());
    }
}
