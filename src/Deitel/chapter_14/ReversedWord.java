package Deitel.chapter_14;

import java.util.Arrays;

public class ReversedWord {

    public static void main(String[] args) {
        String word = "understand i Love Mamas justify occasions";
//        System.out.println(reversedWord2(word));
//h        System.out.println(longestWord(word));
        System.out.println(searching(word, "love"));
    }

    public static StringBuilder reversedWord(String array){
      String s = String.valueOf(array.split(""));
        StringBuilder stringBuilder = new StringBuilder(s);
        return  stringBuilder.reverse();
    }
    public static String reversedWord2(String word){
        String [] array;
        array = word.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = array.length -1; i >=0 ; i--) {
            stringBuffer.append(array[i]);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
    public static String longestWord(String word){
        String[] array;
        array = word.split(" ");
        StringBuilder s;
          //  String s1 = " ";
            String s1 = array[0];
        for (int i = 0; i < array.length; i++) {
            s = new StringBuilder(array[i]);
          //  s1 = array[i];
            if (s.length() > s1.length())
                    s1 = String.valueOf(s);
        }
        return s1;
    }

   public static boolean searching(String word, String find){
       String[] array;
        array = word.split(" ");
        StringBuilder stringBuffer;

       for (String s : array) {
           if (s.equalsIgnoreCase(find)) return true;
       }
       return false;
   }
}



