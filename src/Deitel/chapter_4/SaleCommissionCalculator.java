package Deitel.chapter_4;

import java.util.Scanner;

public class SaleCommissionCalculator {
    private static final int weeklySalary = 200;
    private static String item;
    private static int pieces;
    private static double pricePerItem;
    int percentage;

   private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }



    public static void calculate(){
        System.out.println("NUMBER OF ITEMS SOLD");
        int end = 1;
        int numberOfPieces = 0;
        double cost = 0;
        double totalCost = 0;
        while (end != -1){
            System.out.println("How many pieces?");
            pieces = input.nextInt();


            System.out.println("How much per item");
            pricePerItem = input.nextDouble();

             cost = pieces * pricePerItem;

            System.out.println("press -1 to end and 1 to add more item ");
            end = input.nextInt();

            System.out.println("cost of item for the week:" + cost);
            totalCost += cost;
            System.out.println("TotalCost sold for the week: "+ totalCost);
            }
        double percentage = (totalCost * 9)/100;
       double weeklySalary = 200 + percentage;
        System.out.println();
        System.out.println("WEEKLY SALARY PAID:" + weeklySalary);





        }

}

