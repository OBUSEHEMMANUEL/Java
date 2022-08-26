package Deitel.chapter_4;

import java.util.Scanner;

public class CreditLimitCalculatorMain {
    private static int totalItemsCharged;
    private static int totalCredit;
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Account number and Balance");
        CreditLimitCalculator calculator = new CreditLimitCalculator(getUserInput(), getUserInput());
        System.out.printf("Account Number: %d %nBalance: %d%n", calculator.getAccountNumber(), calculator.getBalance());

        System.out.println("ENTER CHARGES");
        int charges = calculator.setItemsCharged(getUserInput());

        System.out.println("ENTER CREDIT");
        int credit = getUserInput();

        int newBalance = calculator.getBalance() + charges - credit;
        System.out.println("NEW BALANCE: " + newBalance);
        System.out.println("CREDIT LIMIT");
        int creditLimit = getUserInput();
        if (creditLimit > newBalance){
            System.out.println("CREDIT LIMIT EXCEEDED");
        }
    }

    public static int getUserInput() {
        return input.nextInt();
    }


}
