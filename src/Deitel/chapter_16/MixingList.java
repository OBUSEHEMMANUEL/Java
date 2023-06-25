package Deitel.chapter_16;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MixingList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(1);
        list1.add(7);
        list1.add(4);

        List<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(6);
        list2.add(0);
        list2.add(8);
//        System.out.println(list);

        System.out.println(mixingList(list1, list2));


    }
    public static List<Integer> mixingList(List<Integer> num1, List<Integer> num2) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < num1.size(); i++) {
            linkedList.add(num1.get(i));
            linkedList.add(num2.get(i));
        }
        return linkedList;
    }
//        int count = 0;
//        while (count< 4){
//            linkedList.add(num1.get(count));
//            linkedList.add(num2.get(count));
//            count++;
//        }
//        return linkedList;
//    }
}
