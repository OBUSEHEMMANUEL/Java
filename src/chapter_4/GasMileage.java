package chapter_4;

import java.util.Scanner;

import static chapter_4.Average.counter;

public class GasMileage {
    private static Scanner input = new Scanner(System.in);
private static int miles;
private static int gallon;
public static int end;
    public static void main(String[] args) {
        totalNumberOfTrips();
    }
public static int getUserInput(){
    int userInput = input.nextInt();
    return userInput;
}

public static void totalNumberOfTrips() {
    int counter = 0;
    double total = 0;
    double milesPerGallon = 0;



    System.out.println("ENTER MILES TRIPS: ");
    miles = getUserInput();
    System.out.println("HOW MANY GALLONS FOR THE TRIP: ");
    gallon = getUserInput();
    System.out.println("press -1 to end and any other number to continue ");
    end = getUserInput();


    while (end != -1) {
        System.out.println("ENTER MILES TRIPS: ");
        miles = getUserInput();
        System.out.println("HOW MANY GALLONS FOR THE TRIP: ");
        gallon = getUserInput();
        System.out.println("press -1 to end and any other number to continue ");
        end = getUserInput();
        milesPerGallon =(double) miles / gallon;
         counter++;
    }
    double average = milesPerGallon/counter;
    System.out.println("Miles Per gallon per Trip : " + milesPerGallon);
    System.out.println("AVERAGE TRIP : " + average);
}
}




