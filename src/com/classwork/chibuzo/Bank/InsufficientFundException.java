package com.classwork.chibuzo.Bank;

import javax.naming.InsufficientResourcesException;

public class InsufficientFundException extends RuntimeException{

    public InsufficientFundException(String message) {
        super(message);
    }
}
