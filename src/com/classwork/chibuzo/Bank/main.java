package com.classwork.chibuzo.Bank;

import java.util.Scanner;

import static java.lang.System.clearProperty;
import static java.lang.System.exit;


public class main {
    private  static  Bank oniranuBank = new Bank();
    public static void main(String[] args) {
        startAtm();
    }

    private static void startAtm() {
        String mainMenu = """
                welcome to Oniranu Bank
                 1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> check Balance
                6 -> Exit
                (SELECT FROM OPTION)
                """;
        
    String userInput = input(mainMenu);
    switch (userInput){
        case "1" -> createAccount();
       case  "2" -> deposit();
        case "3" -> withdraw();
        case "4" -> transfer();
        case "5" -> checkBalance();
       case "6" -> exit(6);
    }
    
    }

    private static void createAccount() {
        String accountName = input("Enter your account Name");
        String pin = input("Enter your desired pin");
        oniranuBank.createAccountFor(accountName,pin);
        display(String.format("Account has created for %s", accountName));
        startAtm();
    }

    private static void deposit() {
        String accountNumber = input("Enter your account Number");
        int amount = inputInt("Enter amount");
        try{
            oniranuBank.deposit(amount,accountNumber);
            display(String.format("your have successfully Deposited %d", amount));
        }catch (InvalidAmountException ex){
            display(ex.getMessage());
            deposit();
        }
        startAtm();
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account Number");
        int amount = inputInt("Enter amount");
        String pin = input("Enter your desired pin");
        try {
            oniranuBank.withdrawal(amount, accountNumber, pin);
            display(String.format("your have successfully withdrawn %d", amount));
        }catch (InsufficientFundException | InvalidPinException ex){
            display(ex.getMessage());
        }
        startAtm();
    }

    private static void checkBalance() {
        String accountNumber= input("Enter your account Number");
        String pin = input("Enter your desired pin");
        try {
            var balance = oniranuBank.findAccount(accountNumber).getBalance(pin);
            display(String.format("your Balance is %d", balance));
        }catch (InvalidPinException ex){
            display(ex.getMessage());
        }
        startAtm();
    }
    private static void transfer() {
        String senderAccountNumber = input("Enter your account Number");
        String receiverAccountNumber = input("Enter receiver account Number");
        int amount = inputInt("Enter amount");
        String pin = input("Enter your pin number");
        oniranuBank.transfer(senderAccountNumber,receiverAccountNumber,amount,pin);
        display(String.format("Your have successfully transferred %d to account %s ", amount,receiverAccountNumber));
        startAtm();
    }

    private  static int inputInt(String amount){
        display(amount);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

    private static String input(String prompt) {
        display (prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void display(String prompt) {
        System.out.println(prompt);
        
    }

}
