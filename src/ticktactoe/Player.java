package ticktactoe;
public class Player {
    private Board[][] board;

    private  Value value;


    private String playerName;

    public Player() {

    }

    public Player(Value value, String playerName) {
        this.value = value;
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void playGame(int position, Board board) {
        if(position < 0 || position > 9) throw new InvalidPositionException("Invalid position");

        var finalPosition = position - 1;
        var col = finalPosition % 3;
        var row = finalPosition / 3;
        var boardSurface = board.getBoard();
        isEmpty(col, row, boardSurface);
    }

    private void isEmpty(int col, int row, Value[][] boardSurface) {
        if(boardSurface[row][col] == Value.E) boardSurface[row][col] = value;
        else throw new SpaceTakenException("A player has chosen the number");
    }

    public Value getValue() {
        return value;
    }
}

