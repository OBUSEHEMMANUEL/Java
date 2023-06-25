package lambdaExpressons.functional;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("HELLO WORD");

    }
}
