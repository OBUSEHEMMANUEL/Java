package Deitel.chapter_17.examples;

import java.util.Random;
import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.empty();
      var num =  stream.findAny()
                .orElseGet(()->new Random().nextInt());
        System.out.println(num);
    }
}
