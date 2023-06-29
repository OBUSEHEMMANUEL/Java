package Deitel.chapter_17.examples;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        //1.using the empty factory method from Stream
        //interface
        Stream<Integer> numberStream = Stream.empty();

        //2. usinfg the stream utility method of class  Array
        Integer[] numbers = {2,4,5,6,7,8,9};
        Stream<Integer> integerStream = Arrays.stream(numbers);

        //3. using method generate of class stream
        Stream<Integer> nums = Stream.generate(()->6);
        nums.limit(5)
//                filter(num-> num%2 ==0)
        .forEach((n)-> System.out.println(n));
    }
}
