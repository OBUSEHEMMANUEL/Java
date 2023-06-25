package lambdaExpressons.streamListSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("WaterMelon");

        List<String> sortedList = fruits.stream()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedListMethod = fruits.stream().sorted((o1,o2)->o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
        System.out.println(sortedListMethod);
    }
}
