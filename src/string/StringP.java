package string;

import java.util.Arrays;

public class StringP {
        public static void main(String[] args) {
           string();
        }
    public static void string(){
       char[] unicorn = new char[6];
       String str ="cohort Twelve";
       str.getChars(7,13,unicorn,1);
            System.out.println(Arrays.toString(unicorn));


    }
}
