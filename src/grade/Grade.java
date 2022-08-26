package grade;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for(int countergrade = 1; countergrade <= 6; countergrade++){
            System.out.println("Enter user number");
            int grade = input.nextInt();

            switch (grade) {
                case 90:
                case 100:
                    System.out.println("grade is A");
                    System.out.println(" ");
                    break;
                case 60:
                    System.out.println("grade is B");
                    break;
                case 50:
                    System.out.println("grade is C");
                    break;
                case 40:
                    System.out.println("grade is D");
                    break;
                case 30:
                    System.out.println("grade is E");
                    break;
                case 20:
                    System.out.println("grade is F");
            }

            }
        }
    }

