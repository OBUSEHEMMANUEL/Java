package Deitel.chapter_17.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i)-> System.out.println(i * 2);
        consumer.accept(60);
//        consumer.accept(5);
    }
}
