package lambdaExpressons.java_8_stream_tutorial;

import Array.ArraySort;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A","B","C");
        stream.forEach(System.out::println);

        Collection<String> collection = Arrays.asList("JAVA","J2EE","Hibernate");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        List<String>  list = Arrays.asList("JAVA","J2EE","Hibernate");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);


        Set<String> set = new HashSet<>(list);
                Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);


    }
}
