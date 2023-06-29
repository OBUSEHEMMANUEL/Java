package Deitel.chapter_16;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElimination {
    public static void main(String[] args) {
        String[] name = {"Amaka","ruby","victory","grace","victory","Amaka","ruby","grace"};
        Set<String> names = new TreeSet<>(Arrays.asList(name));

        System.out.println(names);

    }

}
