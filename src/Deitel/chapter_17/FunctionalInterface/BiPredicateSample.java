package Deitel.chapter_17.FunctionalInterface;


import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate = (number, word)-> word.length() == 5;
        var result = biPredicate.test(5,"Hello");
        System.out.println(result);
    }
}
