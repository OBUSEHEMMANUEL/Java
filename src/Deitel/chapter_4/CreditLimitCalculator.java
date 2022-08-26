package Deitel.chapter_4;

public class CreditLimitCalculator {
    private static int accountNumber = 0;
    private static int balance = 0;
    private static int ItemsCharged;

    private static int totalCreditApplied;
    private static int allowedLimit = 0;


    public CreditLimitCalculator(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        }

    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public  void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
        public int getBalance() {
            return balance;
        }
        public void setTotalCredit(int allowedlimit){
            if (allowedlimit>= 0) {
                this.allowedLimit = allowedlimit;
            }
        }
        public int getTotalCredit(){
        return allowedLimit;
    }
    public int setItemsCharged(int charges){
      if (charges > 0 ){
          this.ItemsCharged = charges;
      }
        return charges;
    }





}