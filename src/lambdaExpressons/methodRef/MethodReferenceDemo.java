package lambdaExpressons.methodRef;

import java.awt.print.Pageable;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {
    public  static int addition (int a, int b){
     return (a+b);
    }
    public static void main(String[] args) {
//  1)      Method Reference to a static method
//        Lambda Expression
        Function<Integer,Double> function = (input)-> Math.sqrt(input);
        System.out.println(function.apply(4));

        //Using Method Reference
        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));


        BiFunction<Integer,Integer,Integer> biFunction = (a,b)->MethodReferenceDemo.addition(a,b);
        System.out.println(biFunction.apply(10, 20));

        BiFunction<Integer,Integer,Integer> biFunctionMethod = MethodReferenceDemo::addition;
        System.out.println(biFunctionMethod.apply(10, 20));

        //3)
        Function<String,String> stringFunction=(input)->input.toUpperCase();
        System.out.println(stringFunction.apply("Java Guides"));

        Function<String,String> stringFunctionMethod = String::toLowerCase;
        System.out.println(stringFunctionMethod.apply("Java Guides"));
    }


}
