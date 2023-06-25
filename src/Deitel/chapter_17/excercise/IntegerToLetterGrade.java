package Deitel.chapter_17.excercise;

import ticktactoe.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntegerToLetterGrade {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer(55),new Integer(34)
                ,new Integer(56), new Integer(78)));
        ArrayList<String> grade = new ArrayList<>();

        list.add(55);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(45);

        grade.add("A");
        grade.add("B");
        grade.add("C");
        grade.add("D");
        grade.add("F");

        Map<Integer, String> result = new HashMap<>();

//        result.put(list.stream().map(n->n).)
    }
}
