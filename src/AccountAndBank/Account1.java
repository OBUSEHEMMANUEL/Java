package AccountAndBank;

public class Account1 {
    private String accountName;
    private String accountNumber;
    private String pin;
    private int balance;
    private int amount;
    public Account1(String name, String accountNumber, String pin){
        this.accountName = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public  String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    public int getBalance(String pin) {
        if (this.pin.equals(pin)) return balance;
        return 0;
    }

    public void deposit(int amount,String AccountNumber) {
        if(amount >0 && this.accountNumber.equals(AccountNumber)){
            balance = balance + amount;
        }
        }


    public void withdraw(int amount, String accountNumber,String pin) {
        if(amount > 0 &&
                amount < balance &&
                (this.pin.equals(pin) &&
                        this.accountNumber.equals(accountNumber))){
            balance = balance - amount;
        }

    }
}

