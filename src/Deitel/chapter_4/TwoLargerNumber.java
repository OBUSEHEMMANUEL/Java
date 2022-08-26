package Deitel.chapter_4;

import java.util.Scanner;

public class TwoLargerNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        count();
    }

    public static int getUserInput() {
        int userInput = input.nextInt();


        return userInput;
    }

    public static void count() {
        int number = 10;
        int max = 0;
        System.out.println("Numbers");
        while ( getUserInput()!= -1) {

            for (int counter = 1; counter <= getUserInput(); counter++) {
                System.out.println("Numbers");
                int input = getUserInput();
                if (input > max) {
                    max = input;
                }

            }
            System.out.println("The maximum is : " + max);

        }
    }
}