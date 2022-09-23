package ticktactoe;

import java.util.Scanner;

public class TicTacToeMain {
    private static String playerName1;
    private static String playerName2 ;
   static private Player player1;
   static private Player player2;
   static private Board board;

    static private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        playGame();
    }

    public static void playGame(){
        play();
        player1();
        player2();
    }
    public static  void play(){
         playerName1 =input("ENTER PLAYER ONE NAME");
         playerName2 =input("ENTER PLAYER TWO NAME");
         player1 = new Player(Value.X,playerName1);
        player2 = new Player(Value.O,playerName2);

    }
    public static String input(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static int inputInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public static void player1(){
        try {
            int position = inputInt("ENTER POSITION");
            player1.playGame(position, board);
            board.displayBoard();
            if(board.isAWinner()) {
                System.out.println(playerName1 + " WON");
            }
        }catch (InvalidPositionException | SpaceTakenException e){
            System.err.println("Position Does Not Exist Play Else Where");
            player1();
        }
        }
    public static void player2(){
        try {
            int position = inputInt("ENTER POSITION");
            player1.playGame(position, board);
            board.displayBoard();
            if(board.isAWinner()) {System.out.println(playerName2 + " WON");}
        }catch (InvalidPositionException | SpaceTakenException e){
            System.err.println("Position Does Not Exist Play Else Where");
            player2();
        }
    }
}
