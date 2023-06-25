package Deitel.chapter_17.excercise;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecureRandomStreams {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        random.ints(999,1,50).filter(i->i%2==0).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)-> System.out.printf("%-6d%d%n", face, frequency));
    }
}
