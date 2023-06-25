package Deitel.chapter_17.textbookExample.Streams;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        System.out.println("Stream1");
        randomNumber.ints(10,1,7).forEach((n)-> System.out.printf("%d ",n));
        System.out.println();
        System.out.println("Stream2");
        System.out.println(randomNumber.ints(10, 1, 7).mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
