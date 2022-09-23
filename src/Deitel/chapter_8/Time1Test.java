package Deitel.chapter_8;

import java.util.Scanner;

public class Time1Test {
    static Scanner scanner = new Scanner(System.in);
public static int input(String prompt){
    System.out.println(prompt);
    return scanner.nextInt();
}

    public static void main(String[] args) {

        Time1 time = new Time1();

    int hour =input("Enter Hour");
    int minute = input("Enter minute");
    int second = input("Enter Second");

        displayTime("After time is created", time);
        System.out.println();

        time.setTime(hour,minute,second);
        displayTime("After calling set Time", time);

try{
    time.setTime(99,99,99);
}catch (IllegalArgumentException e){
    System.out.printf("Exception message %s%n%n", e.getMessage());

}


}

    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%n Universal Time: %s%n Standard Time: %s%n", header, t.toUniversalString(),t.toString());

    }
}
