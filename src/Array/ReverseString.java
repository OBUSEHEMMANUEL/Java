package Array;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//     String array = "HELLOWORD";
//        System.out.println(reverseString(array));
//        reverseTest(array);

        String array2 ="madam";
        System.out.println(palindrome(array2));

        // System.out.println(reverseString2(array));
//        compare();

    }
    public static String reverseString(String array){

        String word ="";
        for (int i = array.length()-1; i >= 0 ; i--) {
            word+= array.charAt(i);

        }
        return word;

    }
    public static String reverseString2(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }
    public static void compare(){
       String s1 = "Hello";
        String s2 ="Hi";
   var   check =  s1.compareTo(s2);
        System.out.println(check);
    }
    public static String palindrome(String array){
        String value = "";
        for (int i = array.length()-1; i >=0 ; i--) {
            value += array.charAt(i);
        }
        if(value.equalsIgnoreCase(array)){
           return value;
        }else {
            return "word not parlindrome";
        }
    }
    public static void reverseTest(String array){

        for (int i = array.length()-1; i >=0 ; i--) {
            System.out.print(array.charAt(i));

        }
    }
}

