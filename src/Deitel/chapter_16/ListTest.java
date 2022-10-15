package Deitel.chapter_16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color:colors) {
            list1.add(color);
        }
        System.out.printf("list1: %s ",list1);
        System.out.println();
        String[] color2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        for (String color:color2) {
            list2.add(color);
        }
        System.out.printf("list2: %s ",list2);
        list1.addAll(list2);
        printList(list1);
        printList(list2);
        convertToUpper(list1);
        printList(list1);
        convertToUpper(list2);
        printList(list2);
        deleteItem(list1,2,6);
        System.out.println("List1");
        printList(list1);

        reverseItem(list1);
            }
    private static void printList(List<String> list){
        System.out.println("LIST");
        for (String color:list) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }
    private static void convertToUpper(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
           iterator.set(iterator.next().toUpperCase());
        }
    }
    private static void deleteItem(List<String> list, int start, int end){
       list.subList(start,end).clear();
    }
    private static void reverseItem(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("REVERSE ITEM");
        while (iterator.hasPrevious()){
            System.out.printf("%s ",iterator.previous());
        }
    }


}
