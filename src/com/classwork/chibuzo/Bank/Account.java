package com.classwork.chibuzo.Bank;

public class Account {
    private String accountNumber;
    private String accountName;
    private String pin;
    private int balance;

    public Account(String accountNumber, String accountName, String accountPin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        pin = accountPin;

    }

    public int getBalance(String pin){
        if(!isCorrect(pin))throw new InvalidPinException("INVALID PIN");
        return balance;
    }

    public void deposit(int amount) {
       boolean isValidAmount = amount > 0;
        if(!isValidAmount) throw new InvalidAmountException("YOU CANNOT DEPOSIT A NEGATIVE AMOUNT");
       balance = getBalance(pin) + amount;
    }

    public void withdraw(int withdrawAmount, String pin) {
        boolean isAvailableAmount = withdrawAmount < balance && withdrawAmount > 0;
        boolean isPinCorrect = isCorrect(pin);
        if(!isAvailableAmount) throw new InsufficientFundException("INSUFFICIENT FUND");
        else if(!isPinCorrect) throw new InvalidPinException("INVALID PIN");

//       else if (isAvaliableAmount && isPinCorrect)
        balance = getBalance(pin) - withdrawAmount;
    }
    private boolean isCorrect(String pin){
        if (!pin.equals((this.pin))) throw new InvalidPinException("INVALID PIN");

        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                '}';
    }
}
