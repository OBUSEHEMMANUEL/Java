package AssignmentTDD.PhoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    PhoneBook phoneBook = new PhoneBook();
    static PhoneBookMain phoneBookMain = new PhoneBookMain();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       phoneBookMain.phoneBook();
    }
    public String input(String name){
        System.out.println(name);
        return scanner.nextLine();
    }
    public void phoneBook(){

        name();
        address();
        telephoneNumber();
        email();
        call();

    }

    public void name(){
        String name = input("Enter name");
        phoneBook.name(name);
    }

    public void address(){
        String address = input("Enter Address");
        phoneBook.address(address);
    }
    public void telephoneNumber(){
        String number = input("Enter number");
        phoneBook.phoneNumber(number);
    }
    public void email(){
        String email = input("Enter Email");
        phoneBook.email(email);
    }
    public void call(){

            switch (input("ENTER Yes/yes to CONTINUE")){
                case "Yes", "yes" -> {
                    phoneBook();
                }
                default -> {
                    System.out.println("Saved... ");
                    System.out.println("PRINTING RECORD");
                    display();
                }


            }
    }
    public void print(){
        for (int i = 0; i <= 30; i++) {
            System.out.print("=");
        }
    }
    public void display(){
        print();
        System.out.println();
        for (int i = 0; i < PhoneBook.name.size(); i++) {
            System.out.printf("%n%S %s%n  %S %s%n %S %s%n %S %s%n", "Name: ",phoneBook.getName(i),"Address: ",phoneBook.getAddress(i),
                               "Telephone Number: ", phoneBook.getPhoneNumber(i),"Email: ",phoneBook.getEmail(i));
           print();
        }

    }

}
