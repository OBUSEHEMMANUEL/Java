package Deitel.chapter_4;

import java.util.Scanner;

public class LargerNumber {
   private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


count();
    }
    public static int getUserInput(){
        int userInput = input.nextInt();


        return userInput;
    }
    public static void count(){
        int number = 10;
        int max = 0;
        System.out.println("Numbers");

        for (int counter = 1; counter <= 10; counter++){

           int input = getUserInput();
           if(input > max){
               max = input;
           }

        }
        System.out.println("The maximum is : " + max);

    }
}
