package Deitel.chapter_14;

public class StringCompare {
    public static void main(String[] args) {
//        String s1 = new String("Hello");
//        String s3 = "Happy Birthday";
//        String s4 = "Happy Birthday";
//        if (s1.equals("Hello")) System.out.println("s1 is 'HELLO'");
//        if ("Hello" == s1) {
//        } else {
//            System.out.println("compare hello");
//        }
//        if (s3 == s4) System.out.println("EQUALS");
//        else {
//            System.out.println("NOT EQUALS");
//        }
//        if(s3.equalsIgnoreCase(s4)) System.out.println("peace");
//        System.out.println(s3.compareTo(s4));
//        if(s3.regionMatches(false,0,s4,0,5)) System.out.println("match");
        String[] strings = {"started", "starting", "ended", "ending"};

         // test method startsWith
         for (String string : strings) {
             if (string.startsWith("st") ) {
                 System.out.printf("\"%s\" starts with \"st\"%n", string);
                 }
    }
}}
