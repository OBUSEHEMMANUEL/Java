package Deitel.chapter_17.classwork;

import java.util.Arrays;
import java.util.List;

public class Classwork {
    public static void main(String[] args) {
        List<String> alpha = List.of("123ROT", "[}342451@__");

        System.out.println("foreach"+alphanumeric(alpha));
        System.out.println("forloop"+countDigitsInStrings(alpha));

        System.out.println("Stream"+alphanumeric1(alpha));

    }

    private static long alphanumeric1(List<String> alpha) {
        return alpha.stream()
                 .reduce("",(i,j)->i+j).chars()
                 .filter(Character::isDigit).count();
    }

    public static int alphanumeric(List<String> num){
        int count =0;
        for (int i = 0; i < num.size() ; i++) {
            for (int j = 0; j < num.get(i).length(); j++) {
                if (Character.isDigit(num.get(i).charAt(j)))
                    count++;
            }
        }
      return count;
    }
    public static int countDigitsInStrings(List<String> list){
        int count = 0;
        for (String str:list) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)))count++;
            }
        }
        return count;
    }
    public static long countDigits(List<String> words){
        String digits ="0123456789";
        return words.stream()
                .flatMap((s)-> Arrays.stream(s.split("")))
                .filter(digits::contains).count();
    }

}
