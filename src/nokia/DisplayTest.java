package nokia;

import java.util.Scanner;

public class DisplayTest {
    public static void main(String[] args) {
        System.out.println("Display Tests");
        DisplayTest displayTest = new DisplayTest();
        displayTest.input("Print this");
    }

    public String  input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
