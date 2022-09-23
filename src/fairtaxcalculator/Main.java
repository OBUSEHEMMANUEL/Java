package fairtaxcalculator;

import java.util.Scanner;

public class Main {
  static   FairTaxCalculator fairTaxCalculator = new FairTaxCalculator();
    public static void main(String[] args) throws FairTaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMBER OF PRODUCTS");
        int numberOfProducts = scanner.nextInt();

        if(numberOfProducts < 1) throw new FairTaxException("product number cannot be" + numberOfProducts);

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.printf("NAME OF PRODUCT %d", i);
           String productname = scanner.next();
              scanner.nextLine();
            System.out.printf("PRICE of %s", productname);
            Double productPrice = scanner.nextDouble();
            Product product = new Product(productname,productPrice);
         fairTaxCalculator.calculateTotalPrice(product.getPrice());
        }
        double grandPrice = fairTaxCalculator.getTotalPrice();
       double grandTotal = fairTaxCalculator.calculateTax(grandPrice);
        System.out.printf("pay up tax of %d", grandTotal);

    }
}
