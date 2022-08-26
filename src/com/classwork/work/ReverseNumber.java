package com.classwork.work;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverse(12345));
    }
private static   int reverse = 0;
    public static int reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }
        return reverse;
    }
}
