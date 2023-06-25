package ac;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class biginteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits?");
        BigInteger digit = input.nextBigInteger();
        System.out.println("NUMBER: "+ Arrays.toString(digit.divideAndRemainder(BigInteger.valueOf(5))));
    }
}
