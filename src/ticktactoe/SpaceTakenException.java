package ticktactoe;

public class SpaceTakenException extends IndexOutOfBoundsException {
    public SpaceTakenException(String s) {
        super(s);
    }
}
