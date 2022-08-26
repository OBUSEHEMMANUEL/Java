package Deitel.chapter_4;

import java.util.Scanner;

public class Average {
    private static Scanner input = new Scanner(System.in);
    static int counter = 0;
    public static void main(String[] args) {
        getAverage();

    }
    public static int getUserInput(){
        int userInput = input.nextInt();
        return userInput;
    }
    public static void getAverage() {
        int total = 0;
        int average = 0;
        System.out.println("ENTER GRADE " + counter+": ");
       int grade = getUserInput();
        while (grade != -1 ){

            total += grade;
            counter +=1;
            System.out.println("ENTER GRADE " + counter+": ");
            grade = getUserInput();
        }
        average = total/counter;
        System.out.println("THE TOTAL: " + total);
        System.out.println();
        System.out.println("THE TOTAL AVERAGE: " + average);
    }
}
