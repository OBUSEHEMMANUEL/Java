package Deitel.chapter_17.examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example6{
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                                  List.of("Mavricks","Rocket"),
                                  List.of("Unicorns","Luminaries"),
                                  List.of("Mavens","Technophiles")
        );
       var lst =  list.stream()
               .flatMap((l)->l.stream())
               .collect(Collectors.toList());
        System.out.println(lst);
    }
}
