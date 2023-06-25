package lambdaExpressons.functional;



import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate = (s1, s2)-> s1.equals(s2);
        System.out.println(biPredicate.test("emma", "EMMA"));
        System.out.println(biPredicate.test("EMMA", "EMMA"));
    }

}
