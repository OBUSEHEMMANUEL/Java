package Deitel.chapter_17.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> biFunction =(num1,num2)-> Integer.valueOf(num1) * Integer.valueOf( num2);
      var result =  biFunction.apply("1","6");
        System.out.println(result);


    }
}
