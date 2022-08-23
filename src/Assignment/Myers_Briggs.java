package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Myers_Briggs {

    private static Scanner input = new Scanner(System.in);


    public static String getUserInput() {
        String userInput;
        return userInput = input.nextLine();
    }

    static ArrayList<String> options = new ArrayList<>();
    static int aCount = 0;
    static int bCount = 0;
    static int aCount1 = 0;
    static int bCount1 = 0;
    static int aCount2 = 0;
    static int bCount2 = 0;
    static int aCount3 = 0;
    static int bCount3 = 0;


public static void testing() {
    System.out.println("1.\n A.expend energy, enjoy group B. conserve energy, enjoy one-on-one");
    String answers = input.nextLine();
    switch (answers) {
        case "A", "a" -> aCount++;
        case "B", "b" -> bCount++;
        default -> {
            System.out.println("invalid input");
            testing();
        }
    }
}
    public static void options() {

        System.out.println("2.\n A.interpret literally   B.look for meaning and possibilities");
        switch (getUserInput()) {
            case "A", "a":
                aCount1++;
            case "B", "b":
                bCount1++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("3.\n A.logical Thinking, questioning   B.empathetic, feeling accommodating");
        switch (getUserInput()) {
            case "A", "a":
                aCount2++;
            case "B", "b":
                bCount2++;
                break;
            default:
                System.out.println("invalid input");
                getUserInput();
                break;
        }

        System.out.println("4.\n A.organized orderly   B.flexible,adaptable ");
        switch (getUserInput()) {
            case "A", "a":
                aCount3++;
            case "B", "b":
                bCount3++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("5.\n A.more outgoing,think out loud  B.more reserved, think to yourself");
        switch (getUserInput()) {
            case "A", "a":
                aCount++;
            case "B", "b":
                bCount++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("6.\n A.practical,realistic,experiential   B.imaginative,innovative theoretical");
        switch (getUserInput()) {
            case "A", "a":
                aCount1++;
            case "B", "b":
                bCount1++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("7.\n A.candid,straight forward,frank  B.tactful,kind,encouraging");
        switch (getUserInput()) {
            case "A", "a":
                aCount2++;
            case "B", "b":
                bCount2++;
                break;
            default:
                System.out.println("invalid input");
                getUserInput();
                break;
        }
        System.out.println("8.\n A.plan, schedule  B.unplanned, spontenous");
        switch (getUserInput()) {
            case "A", "a":
                aCount3++;
            case "B", "b":
                bCount3++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("9.\n A.seek many task, public activities, interaction with others  " +
                "B.seek private, solitary activities with quiet to concentrate");
        switch (getUserInput()) {
            case "A", "a":
                aCount++;
            case "B", "b":
                bCount++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("10.\n A.standard, usual, conventional  B.different, novel, unique");
        switch (getUserInput()) {
            case "A", "a":
                aCount1++;
            case "B", "b":
                bCount1++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("11.\n A.firm, tend to critize, hold the line  B.gentle, tend to appreciate, concilate");
        switch (getUserInput()) {
            case "A", "a":
                aCount2++;
            case "B", "b":
                bCount2++;
                break;
            default:
                System.out.println("invalid input");
                getUserInput();
                break;
        }
        System.out.println("12.\n  A.regulated, structured, B. easygoing 'live' and 'let input' ");
        switch (getUserInput()) {
            case "A", "a":
                aCount3++;
            case "B", "b":
                bCount3++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("13.\n A.external communicative, express yourself  B.internal, reticent, keep to yourself");
        switch (getUserInput()) {
            case "A", "a":
                aCount++;
            case "B", "b":
                bCount++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("14.\n A.focus on here-and-now, B.look to the future, global perspective,'big picture'");
        switch (getUserInput()) {
            case "A", "a":
                aCount1++;
            case "B", "b":
                bCount1++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("15.\n A. tough-minded, just  B.tender-hearted,merciful");
        switch (getUserInput()) {
            case "A", "a":
                aCount2++;
            case "B", "b":
                bCount2++;
                break;
            default:
                System.out.println("invalid input");
                getUserInput();
                break;
        }
        System.out.println("16\n A.preparation, plan ahead B.go with the flow, adapt as you go");
        switch (getUserInput()) {
            case "A", "a":
                aCount3++;
            case "B", "b":
                bCount3++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("17.\n A.active,initiate B.reflective, deliberate");
        switch (getUserInput()) {
            case "A", "a":
                aCount++;
            case "B", "b":
                bCount++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("18.\n A. facts, things, 'what is'  B. ideas, dreams, 'what could be' philosophical");
        switch (getUserInput()) {
            case "A", "a":
                aCount1++;
            case "B", "b":
                bCount1++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println("19.\n A. matter of fact , issue-oriented  B. sensitive, people-oriented ,compassionate");
        switch (getUserInput()) {
            case "A", "a":
                aCount2++;
            case "B", "b":
                bCount2++;
                break;
            default:
                System.out.println("invalid input");
                getUserInput();
                break;
        }
        System.out.println("20.\n A. control, govern  B. latitude, freedom");
        switch (getUserInput()) {
            case "A", "a":
                aCount3++;
            case "B", "b":
                bCount3++;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
    public static void getCompare(){
        for (int i = 0; i <60; i++){
            System.out.print("-");
        }
        if (aCount > bCount){
            System.out.print(" \n E- Extrovert");
        }
        else {
            System.out.print("\n I- Introvert");
        }
        if (aCount1 > bCount1){
            System.out.print(" S- Sensing");
        }
        else {
            System.out.print(" N- Intuition ");
        }
        if (aCount2 > bCount2){
            System.out.print(" T- Thinking");
        }
        else {
            System.out.print(" F- Feeling ");
        }
        if (aCount3 > bCount3){
            System.out.print(" J- Judging\n");
        }
        else {
            System.out.print("  P- Perceiving\n");
        }
            for (int i = 0; i <60; i++){
                System.out.print("-");
            }
    }

}



