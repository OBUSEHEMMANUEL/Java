 package Assignment;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class ReceiptTest {

    public static void main(String[] args) {
       SimpleDateFormat Formatter = new SimpleDateFormat();
       Date date = new Date();
        Scanner input = new Scanner(System.in);
        String customerName;
        String userItemBought;
        int piecesQuantity;
        String cashierName;
        String decision;
        double discount;
        double discountAmount;
        double pricePerUnit;
        double total;
        double VAT;
        double billTotal;
        double subTotal = 0;

        System.out.println("What is the customer's name");
             customerName = input.nextLine();

             ArrayList<Receipt> receipts = new ArrayList<>();


             do {
                 System.out.println("What did the user buy?");
                 userItemBought = input.nextLine();

                 System.out.println("How many pieces?");
                 piecesQuantity = input.nextInt();


                 System.out.println("How much per item");
                 pricePerUnit = input.nextDouble();

                 total = piecesQuantity * pricePerUnit;
                 receipts.add(new Receipt(userItemBought, piecesQuantity, pricePerUnit, total));
                 subTotal = subTotal + total;

                 System.out.println("Add more item");
                 decision = input.next();
                 input.nextLine();
             }
        while ((Objects.equals(decision, "Yes")) || (Objects.equals(decision, "yes")));
        if (decision.equals("No")|| decision.equals("no")){
            System.out.println();
        }else {
            System.out.println("INVALID INPUT");
        }
        System.out.println("Cashier Name: ");
        cashierName = input.nextLine();

        discount = 3;

        discountAmount = subTotal * discount/100;

        VAT = subTotal / 17.05;
        billTotal = subTotal - discountAmount + VAT;


        System.out.printf("%nSEMICOLON STORES%n%n MAIN BRANCH%n%n LOCATION: 312, HERBERT MACULAY WAY, SABO YABA,LAGOS." +
                "%n%n TEL: 0905905 %n%n Cashier: %2s%n Customer:  %2s%n DATE AND TIME:%2s%n ", cashierName, customerName, date);
        for (int i =0; i <= 70; i++){
            System.out.print("=");
        }
        System.out.println();

        System.out.printf("%15s %15s %15S  %15S ", "ITEM","QUANTITY","PRICE", "TOTAL(NGN)");
        System.out.println();
        System.out.println();

        System.out.println();
        for (int i =0; i <= 70; i++){
            System.out.print("=");
        }
        System.out.println();

        for (Receipt receipt:receipts){

            receipt.printFormat();
        }
        System.out.println();
        System.out.println();

        for (int i =0; i <= 70; i++){
            System.out.print("=");
        }


        System.out.printf("%n%46s: %15.2f","sub Total", subTotal);
        System.out.printf("%n%46s: %15.2f","Discount", discountAmount);
       System.out.printf("%n%46s: %15.2f","VAT", VAT);
        System.out.println();

        for (int i =0; i <= 70; i++){
            System.out.print("=");
        }
        System.out.printf("   %n%46s: %15.2f%n", "TOTAL BILL",billTotal);

        for (int i =0; i <= 70; i++){
            System.out.print("=");
        }
    }





    }

