package com.classwork.chibuzo.Bank;

public class Bank {
    private int numberOfCustomer;
    private Account[] accounts = new Account[10];

    public void createAccountFor(String accountName, String pin) {

        Account account = new Account((numberOfCustomer+1)+"", accountName,pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOFCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {
        for(Account account:accounts){
            if(account.getAccountNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
       Account account= findAccount(accountNumber);
       account.deposit(amount);

    }

    public void withdrawal(int amount, String accountNUmber, String pin) {
        Account account = findAccount(accountNUmber);
        account.withdraw(amount,pin);
    }

    public void transfer(String sender, String reciever, int amount, String pin) {
        Account senderAccount = findAccount(sender);
        Account recieverAccount = findAccount(reciever);
        senderAccount.withdraw(amount,pin);
        recieverAccount.deposit(amount);
    }
}
