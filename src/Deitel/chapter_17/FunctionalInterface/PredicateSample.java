package Deitel.chapter_17.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String > predicate = (word)-> word.length() ==7;
        var result = predicate.test("unicorn");
        System.out.println(result);
    }
}
