package creditCardValidation;

import java.util.InputMismatchException;

public class IllegalCardException extends InputMismatchException {
    public IllegalCardException(String s) {
        super(s);
    }
}
