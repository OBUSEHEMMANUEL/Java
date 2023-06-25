package lambdaExpressons.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (u,v)-> (u+v);

        System.out.println(biFunction.apply(20, 30));
        Function<Integer,Integer> function = (number)->number *number;

        System.out.println(biFunction.andThen(function).apply(6, 9));
    }
}
