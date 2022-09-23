package ticktactoe;

import java.util.Scanner;

public class TickTacToe {
    public static void main(String[] args) {
        board();
        displayBoard();
    }
    static Scanner scanner = new Scanner(System.in);
   static char [][] board;


    public static void board(){
        board = new char[3][3];
        for (int rows = 0; rows < board.length ; rows++) {
            for (int columns = 0; columns < board.length ; columns++) {
                System.out.println("SELECT X and O");
                board[rows][columns] =   scanner.next().charAt(0);
            }


        }

    }
    public static void displayBoard(){
        System.out.println("RESULT\n");
        for (int rows = 0; rows < board.length ; rows++) {
            for (int columns = 0; columns < board[rows].length ; columns++) {
                System.out.print(board[rows][columns]);
                if(columns != board.length -1) System.out.print( " | " );
            }
            System.out.println( );
        }

    }



}
