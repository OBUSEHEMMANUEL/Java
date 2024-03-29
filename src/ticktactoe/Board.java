package ticktactoe;

import static ticktactoe.Value.*;

public class Board {


    private boolean isX, isO;
    private TicTacToeMain ticTacToeMain = new TicTacToeMain();

    private Player player = new Player();

    final Value[][] board = {{E, E, E}, {E, E, E}, {E, E, E}};

    public Value[][] getBoard() {
        return board;
    }

    public void displayBoard() {
        for (int row = 0; row < board.length ; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if(column != board.length -1)System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean isAWinner() {
        if(isWinnerOnRowOne()) return true;
        else if (isWinnerOnRowTwo())return true;
        else if (isWinnerOnRowThree())return true;
        else if (isWinnerOnColumnOne()) return true;
        else if (isWinnerOnColumnTwo()) return true;
        else if (isWinnerOnColumnThree()) return true;
        else if (isWinnerOnAxisOne()) return true;
        return isWinnerOnAxisTwo();
    }

    private boolean isWinnerOnRowOne() {
        var boardSurface = getBoard();
        isX = boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X;
        isO = boardSurface[0][0] == O && boardSurface[0][1] == O && boardSurface[0][2] == O;
//       determineWinner(isX, isO);
        return isX || isO;
    }

    private boolean isWinnerOnRowTwo() {
        var boardSurface = getBoard();
        isX = boardSurface[1][0] == X && boardSurface[1][1] == X && boardSurface[1][2] == X;
        isO =boardSurface[1][0] == O && boardSurface[1][1] == O && boardSurface[1][2] == O;
//        determineWinner(isX,isO);
        return isX || isO;
    }
    private boolean isWinnerOnRowThree() {
        var boardSurface = getBoard();
        isX = boardSurface[2][0] == X && boardSurface[2][1] == X && boardSurface[2][2] == X;
        isO =boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] == O;
//        determineWinner(isX,isO);
        return isX || isO;
    }
    private boolean isWinnerOnColumnOne() {
        var boardSurface = getBoard();
        isX = boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] == X;
        isO =boardSurface[0][0] == O && boardSurface[1][0] == O && boardSurface[2][0] == O;
//        determineWinner(isX,isO);
        return isX || isO;
    }
    private boolean isWinnerOnColumnTwo(){
    var boardSurface = getBoard();
    isX = boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] == X;
    isO = boardSurface[0][1] == O && boardSurface[1][1] == O && boardSurface[2][1] == O;
//    determineWinner(isX,isO);
            return isX || isO;
    }
        private boolean isWinnerOnColumnThree() {
        var boardSurface = getBoard();
        isX = boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] == X;
        isO = boardSurface[0][2] == O && boardSurface[1][2] == O && boardSurface[2][2] == O;
//       determineWinner(isX,isO);
        return isX || isO;
    }
    private boolean isWinnerOnAxisOne() {
        var boardSurface = getBoard();
        isX = boardSurface[0][2] == X && boardSurface[1][1] == X && boardSurface[2][0] == X;
        isO = boardSurface[0][2] == O && boardSurface[1][1] == O && boardSurface[2][0] == O;
//        determineWinner(isX, isO);
        return isX || isO;
    }
    private boolean isWinnerOnAxisTwo() {
        var boardSurface = getBoard();
        isX = boardSurface[0][0] == X && boardSurface[1][1] == X && boardSurface[2][2] == X;
        isO = boardSurface[0][0] == O && boardSurface[1][1] == O && boardSurface[2][2] == O;
//        determineWinner(isX, isO);

        return isX || isO;
    }

    public boolean isTy() {
//        var tie = !isAWinner();
//        if(tie) System.out.println("It is a Tie");
//        return tie;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j] == E)return  true;
            }

        }
        return false;
    }

    public boolean isTie(){
        if(!isTy() && !isAWinner())return  true;
        else return false;
    }
//    void determineWinner(boolean isX, boolean isO) {
//        if (isX) System.out.println( player.getPlayerName() + " is the Winner");
//        else if (isO) System.out.println(player.getPlayerName() + " is  winner");
//    }
}