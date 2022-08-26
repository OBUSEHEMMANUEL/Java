package AccountAndBank;

public class Bank1 {

    private int numberOfCustomers;
    private Account1[] accounts = new Account1[10];





    public void createAccountFor(String accountName, String pin) {
        Account1 account = new Account1(accountName,(numberOfCustomers +1)+"",pin);
    accounts[numberOfCustomers] = account;
    numberOfCustomers++;

    }
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Account1 findAccountNumber(String accountNumber) {
        for(Account1 account: accounts){
            if(account.getAccountNumber().equals(accountNumber))
            return account;
        }
        return null;
    }

    public void deposit( int amount,String accountNumber) {
      Account1 account = findAccountNumber(accountNumber);
        account.deposit(amount,accountNumber);
    }

    public void withdrawal(int amount, String accountNumber, String pin){
        Account1 account = findAccountNumber(accountNumber);
        account.withdraw(amount,accountNumber,pin);


    }
}
