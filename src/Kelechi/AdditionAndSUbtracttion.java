package Kelechi;

import java.util.Scanner;

public class AdditionAndSUbtracttion {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter DIGITS");
        int number = input.nextInt();
        System.out.println("Enter SECOND DIGITS");
                int number1 = input.nextInt();
        int getVoteCount = number -number1;

        System.out.println(getVoteCount);
        ;
    }
}
