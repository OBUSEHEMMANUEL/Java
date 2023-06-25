package Deitel.chapter_17.textbookExample.Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStream2 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        System.out.println(Arrays.asList(strings));
        System.out.println();

        System.out.println(Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

        System.out.println(Arrays.stream(strings).map(String::toLowerCase).collect(Collectors.toList()));

        System.out.println("STRING LESSER THAN N");

        System.out.println(Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") >0).sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }
}
