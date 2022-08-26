package ac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        char x = 'a';
//        char y = 'c';
//        System.out.println(++x);
//        System.out.println(y++);
//        System.out.println(x - y);
        Scanner input = new Scanner(System.in);

         // Prompt the user to enter two cities
         System.out.print("Enter the first city: ");
         String city1 = input.nextLine();
         System.out.print("Enter the second city: ");
         String city2 = input.nextLine();

         if (city1.compareTo(city2) < 0)
             System.out.println("The cities in alphabetical order are " +
                 city1 + " " + city2);
         else
         System.out.println("The cities in alphabetical order are " +
                 city2 + " " + city1);
    }
}
