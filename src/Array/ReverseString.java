package Array;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
     String array = "HELLOWORD";
//        System.out.println(reverseString(array));
        reverseTest(array);
      //  String array2 ="kiss";
        //palindrome(array2);
       // System.out.println(reverseString2(array));
//        compare();

    }
    public static StringBuilder reverseString(String array){
        String[] reverse = new String[array.length()];
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < array.length(); i++){
           reverse[i] = String.valueOf(array.charAt(i));
        }
        for (int i = reverse.length-1; i >= 0 ; i--) {
            result.append(reverse[i]);
        }
        return result;

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
    public static void palindrome(String array){
        String value = "";
        for (int i = array.length()-1; i >=0 ; i--) {
            value += array.charAt(i);
        }
        if(value.toString().equalsIgnoreCase(array)){
            System.out.println(value+ " This is palindrome");
        }else {
            System.out.println(value+ " This is not palindrome");
        }
    }
    public static void reverseTest(String array){

        for (int i = array.length()-1; i >=0 ; i--) {
            System.out.print(array.charAt(i));

        }
    }
}

