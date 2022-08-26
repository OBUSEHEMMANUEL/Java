package Assignment;

import java.util.Scanner;

public class HighestNumber2 {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        checkSum2();
    }
    public static void checkSum2(){

        System.out.println("Enter number 1");
         var user_input = input.nextInt();

        int largest_number = user_input;
        int lowest_number = user_input;
        int count = 1;
        while (count < 5){
            System.out.println("Enter Number"+ (count +1));
            user_input = input.nextInt();

            if(user_input < largest_number) {
                largest_number = user_input;
            }
            if(user_input > lowest_number ){
                lowest_number = user_input;
            }
            count++;
        }
        System.out.println(lowest_number);
        System.out.println(largest_number);

        }




    public static void checkSum1(){
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for (int count = 0; count < 5; count++){
            System.out.println("Enter Number");
            int number = input.nextInt();

            if(number < minNumber) {
                minNumber = number;
            }
            if(number > maxNumber ){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }

    public static void checkSum(){

        System.out.println("Enter Number");
        int number = input.nextInt();
        int max = number;
        int min = number;
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter Number");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("MAXIMIM VALUE : " + max);
        System.out.println("MINIMUM VALUE: " + min);
    }
}
