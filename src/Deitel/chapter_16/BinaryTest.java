package Deitel.chapter_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow",
                 "purple", "tan", "pink"};
         List<String> list = new ArrayList<>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        System.out.println(Collections.binarySearch(list, "black"));
        System.out.println(Collections.binarySearch(list, "white"));

    }
}
