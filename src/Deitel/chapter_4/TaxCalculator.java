package Deitel.chapter_4;

import java.util.Scanner;

public class TaxCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }

    public static int userInput(){
       int userInput = input.nextInt();
       return userInput;
    }
    public static void calculate(){
        int percentage;
        System.out.println("ENTER SALARY" );
        int input = userInput();

        if (input >= 30_000){
             percentage = (input * 15)/100;
        }else {
            percentage = (input * 20)/100;
        }

        System.out.println(percentage);
    }
}

