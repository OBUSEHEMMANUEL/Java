package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        name();
        address();
        telephone();
        email();
    }
    static final Scanner input = new Scanner(System.in);

    public static String getUserInput(){
        String userInput;
        return userInput = input.nextLine();
    }
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> address = new ArrayList<>();
    static ArrayList<String> telephone = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();

    public static void name(){
            System.out.println("Name");
            name.add(getUserInput());
    }
    public static void address(){
        System.out.println("Address");
        address.add(getUserInput());
    }
    public static void telephone(){
        System.out.println("Telephone");
        telephone.add(getUserInput());
    }
    public static void email(){
        System.out.println("Email");
        email.add(getUserInput());

        System.out.println("Would you like to add a new Contact,Yes or No" );
        switch (getUserInput()){
            case "Yes":
            case "yes":
                addNewName();
                break;

            default:
                System.out.println("Name Saved Successfully");
                output();
                break;
        }
    }
    public static void addNewName(){
        name();
        address();
        telephone();
        email();
        }

        public static void output(){
        for (int i = 0; i<70; i++) {
            System.out.print("=");
        }
        for(int counter = 0 ; counter < name.size(); counter++)
            System.out.printf("%n%s%s%n%s%s%n%s%s%n%s%s%n" , "Name: " , name.get(counter) , "Address: " , address.get(counter) ,
                    "Telephone: " , telephone.get(counter) , "Email: " , email.get(counter));

            for (int i = 0; i<70; i++) {
                System.out.print("=");
            }

        }
    }
