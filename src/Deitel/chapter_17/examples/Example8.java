package Deitel.chapter_17.examples;

import Deitel.chapter_17.examples.Woman;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Woman> women = List.of(
                new Woman("Banke",60),
                new Woman("jennifer",109),
                new Woman("Godman",40)
        );
        List<Woman> sortedWomen = women.stream()
                .sorted(Comparator.comparing(Woman::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedWomen);

//        Map<String,Integer> map = new T<reeMap<>();
//      System.out.println(women);
//        women.stream()
//                .map((woman)->map.put(woman.getName(), woman.getAge()))
//                .forEach((age)-> System.out.print(""));
//        System.out.println(map);

    }
}
