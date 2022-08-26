package Kelechi;


import java.util.Scanner;

public class FunctionThatAdds1Number {
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        row();
    }
    public int userInput(int userInput){
        userInput = input.nextInt();
        return userInput;
    }
    public static void row (){
        System.out.println("Enter NUmber");
        int cal = input.nextInt();
        System.out.println(cal +1);

    }
}
