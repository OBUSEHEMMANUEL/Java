package Assignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DiaryCheck {
    SimpleDateFormat Formatter = new SimpleDateFormat();

    static Scanner input = new Scanner(System.in);
    private String personName;
    private String thought;
   private static int yesCount;


    public static void main(String[] args) {
        printout();
    }

    public static String getUserInput() {
        String userInput;
        return userInput = input.nextLine();
    }


static ArrayList<String> name =new ArrayList<>();
    static ArrayList<String> options = new ArrayList<>();

    public static void name() {
        System.out.println("what is your name");
        name.add(getUserInput());
    }
    public static void option() {
        System.out.println( name + "write your thoughts");
         options.add(getUserInput());
    }
    public static void recallThought(){
       yesCount = 0;

        for (int i = 0; i < options.size(); i++) {
            System.out.println("DO YOU WANT TO ADD THOUGHTS Yes/NO");
            String answer = getUserInput();
            switch (answer) {
                case "yes", "Yes", "YES": {
                    option();
                    System.out.println( "page "+ (1+ yesCount++));

                    break;
                }
                case "No", "no":
                    System.out.println("SAVED");
                    break;
            }
        }
        printThoughts();
    }

    private static void printThoughts() {
        for (int i = 0; i < options.size() ; i++) {
            System.out.println(options.get(i));
        }
    }


    public static void frontPage () {
            Date date = new Date();

            System.out.printf("WELCOME TO WHERE YOUR THOUGHT DIARY %n %n%2s%n", date);
        }


        public static void printout () {
            frontPage();
            name();
            option();
            recallThought();
        }
        public ArrayList<String> findEntries (int pages) {
        ArrayList<String> found = new ArrayList<>();
        for (String option: options){
            if((yesCount == options.size() ));
        }
return found;

        }
        public void deleteEntries(int pages){
        ArrayList<String> found = findEntries(pages);
        for (String option : found){
            options.remove(option);
        }

        }

    }


