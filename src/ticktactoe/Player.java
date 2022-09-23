package ticktactoe;
public class Player {
    private Board[][] board;

    private final Value value;
    private final String name;


    public Player(Value value, String name) {
        this.value = value;
        this.name = name;
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

