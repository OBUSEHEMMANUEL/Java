package ticktactoe;

public class InvalidPositionException extends IndexOutOfBoundsException {
    public InvalidPositionException(String s) {
        super(s);
    }
}
