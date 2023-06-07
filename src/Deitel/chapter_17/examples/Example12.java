package Deitel.chapter_17.examples;

import java.util.List;

public class Example12 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Tom","jerry","Mickey","Donald"
        );
        var name = list.stream()
                .findFirst()
                .orElse("-1");
        System.out.println(name);
    }
        }
