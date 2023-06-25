package lambdaExpressons.methodRef;

import java.util.*;
import java.util.function.Function;

public class MethodReferenceDemo2 {
    public static void main(String[] args) {
        String[] strArray = {"A","E","I","O","U", "a","e","i","o","u"};
        Arrays.sort(strArray, (s1,s2)-> s1.compareToIgnoreCase(s2));

        System.out.println(Arrays.toString(strArray));


        //Lambda
        Arrays.sort(strArray, String::compareToIgnoreCase);


        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("WaterMelon");

        Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
        System.out.println(setFunction.apply(fruits));


    }
}