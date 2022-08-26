package com.classwork.work;

public class Factors {
       public static void main(String[] args) {
      Factors factor = new Factors();
      boolean number=  factor.primeNumber(13);
           System.out.println(number);

 }
    public int factors(int no) {
        int count = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0)
                count++;
        }
        // System.out.printf("Factor of %d: ", no);
        return count++;
    }
    public boolean primeNumber(int no) {
        int count = 0;
        for (int i = 1; i <= no; i++) {
            if ( no % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
