package Deitel.Chapter_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator/denominator;
    }public static int module(int numerator, int denominator)throws ArithmeticException{
        return numerator%denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do{
            try{
                System.out.println("ENTER NUMERATOR");
                int numerator = scanner.nextInt();
                System.out.println("ENTER DENOMINATOR");
                int denominator = scanner.nextInt();
                System.out.printf("%n NUMERATOR / DENOMINATOR = %d remainder %d",quotient(numerator,denominator),module(numerator,denominator));
                continueLoop = false;
            }catch (InputMismatchException e){
                System.err.printf("%n EXCEPTION: %s%n", e);
                scanner.nextLine();
                System.out.println("ENTER INTEGER NUMBERS");
            }catch (ArithmeticException e){
                System.err.printf("%n EXCEPTION: %s%n",e);
                System.out.printf("ENTER NUMBER GREATER THAN ZERO%n");
            }
        }while (continueLoop);
    }
}
