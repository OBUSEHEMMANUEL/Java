package guessGame;

import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GUESS YOUR NUMBER: ");
        int number = input.nextInt();

        if (number == 67){
            System.out.println("YOUR ARE CORRECT");
        }
        if (number >= 60 && number  <= 66){
System.out.println("YOU ARE LITTLE BELOW TO NUMBER");
        }
        if (number >= 68 && number <= 75){
            System.out.println("YOU ARE LITTLE ABOVE NUMBER");
        }

        if (number >= 76 ) {
            System.out.println("NUMBER ABOVE EXACT NUMBER");
        }
        if (number <= 59){
            System.out.println("NUMBER BELOW EXACT NUMBER");
        }
    }
}
