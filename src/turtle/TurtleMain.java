package turtle;

import java.util.Scanner;

import static java.lang.System.exit;

public class TurtleMain {
    Scanner scanner = new Scanner(System.in);
   Sketchpad sketchpad = new Sketchpad(20,20);
  Turtle turtle = new Turtle();
  static TurtleMain turtleMain = new TurtleMain();

    public static void main(String[] args) {
        turtleMain.openPage();
    }

    public void openPage(){
        String mainMenu = """
                     Turtle game:
                    1-> PEN UP
                    2-> PEN DOWN
                    3-> TURN RIGHT
                    4-> TURN LEFT
                    5-> MOVE
                    6-> DISPLAY THE SKETCHPAD
                    9-> END
                    """;
       switch (turtleMain.input(mainMenu)){
           case "1" -> penUp();
           case "2" -> penDown();
           case "3" -> turnRight();
           case "4" -> turnLeft();
           case "5" -> move();
           case "6" -> displayFloor();
           case "9" -> exit(9);
           default -> openPage();
       }
    }

    public String input(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void penUp(){
        turtle.penUp();
        turtleMain.openPage();
    }
    public void penDown(){
        turtle.penDown();
        turtleMain.openPage();
    }
    public void turnRight(){
        turtle.turnRight();
        turtleMain.openPage();
    }

    public void turnLeft(){
        turtle.turnLeft();
        turtleMain.openPage();
    }
    public void move(){

        int moves = inputInt("Enter Number of Moves");
        turtle.move(moves,sketchpad);
        scanner.nextLine();
        turtleMain.openPage();

    }
    public void displayFloor(){
        sketchpad.displayFloor();
        turtleMain.openPage();
    }
    public int inputInt(String moves){
        System.out.println(moves);
        return scanner.nextInt();
    }
}
