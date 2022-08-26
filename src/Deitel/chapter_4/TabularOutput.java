 package Deitel.chapter_4;

import java.util.Scanner;

public class TabularOutput {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        output();
    }
    public static int getUserInput(){
       int userInput = input.nextInt();
       return userInput;
    }
    public static void output(){
        System.out.println("Enter digitss");
        System.out.print("\nN\t\t\tN^2\t\t\tN^3\t\t\tN^4\n");

        for (int i = 0; i <= 5; i++) {
            int num = i;
            int num1 = (int) Math.pow(i,2);
            int num2 = (int) Math.pow(i,3);
            int num3 = (int) Math.pow(i,4);

            System.out.println();
            System.out.printf("%d",num);

            System.out.printf("%13d", num1);
            System.out.printf("%13d",num2);
            System.out.printf("%13d",num3);

        }



    } 
    
}
