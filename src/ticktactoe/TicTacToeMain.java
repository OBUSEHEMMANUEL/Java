package ticktactoe;

import java.util.Scanner;

import static java.lang.System.exit;
import static ticktactoe.Value.O;
import static ticktactoe.Value.X;

public class TicTacToeMain {
    private static Player player1 = new Player();
    private static Player player2 = new Player();
    private static String playerName1;
    private static String playerName2;

//    private static Player player = new Player();

    private static final Board board = new Board();
    static private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        play();
        playGame();
    }

    public static void playGame(){

//        gameTime();
        player1Turn();
        player2Turn();
        playGame();

    }
    public static void play(){
player1();
player2();
    }

    public static String player1(){
        playerName1 = input("ENTER PLAYER ONE NAME");
        player1 = new Player(X, playerName1);
        return playerName1;
    }

    public static String player2(){
        playerName2 = input("ENTER PLAYER TWO NAME");
        player2 = new Player(O, playerName2);
        return playerName2;
    }

    public static String input(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static int inputInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static void player1Turn(){
//        int count = 0;
        try {

            int position = inputInt( player1.getPlayerName()+ " turn \n ENTER POSITION To mark Board");
            player1.playGame(position, board);
            board.displayBoard();
            if(board.isAWinner()){
                System.out.println(player1.getPlayerName() +" is the winner");
                exit(2);
            }
            if(board.isTie()) {
                System.out.println("Its a tie");
                exit(2);
            }

//            if (count >= 4) System.out.println("IT IS A TIE");
//            count++;
        }
        catch (InvalidPositionException | SpaceTakenException e){
            System.out.println(e.getMessage());
            player1Turn();
        }
//        return board.isAWinner();

    }

    public static void player2Turn(){
        try {

            int position = inputInt(player2.getPlayerName() + " turn \n ENTER POSITION To mark Board");
            player2.playGame(position, board);
            board.displayBoard();
            if(board.isAWinner()){
                System.out.println(player2.getPlayerName() + " is the winner");
                exit(2);
            }
            if(board.isTie()) {
                System.out.println("Its a tie");
                exit(2);
            }


        }
        catch (InvalidPositionException | SpaceTakenException e){
            System.out.println(e.getMessage());
            player2Turn();
        }
//        return board.isAWinner();
    }
//    public static void gameTime(){
//        while (!board.isAWinner() || !board.isTie()){
//            if (player1Turn()) break;
//            if (player2Turn()) break;
//        }
//    }
//    public static void gameTie(){
//        if (board.isTie())
//        exit(2);
//    }

}