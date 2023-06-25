package Deitel.chapter_17.FunctionalInterface;

import javax.management.OperationsException;
import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number1,number2)-> number1*number2;

       var result = binaryOperator.apply(4,5);
        System.out.println(result);

            }
}
