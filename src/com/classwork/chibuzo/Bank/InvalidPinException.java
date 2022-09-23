package com.classwork.chibuzo.Bank;

import java.util.InputMismatchException;

public class InvalidPinException extends InputMismatchException {
    public InvalidPinException(String s) {
        super(s);
    }
}
