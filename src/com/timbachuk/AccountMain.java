package com.timbachuk;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500);
        System.out.println(account.getBalance());
        account.withdrawal(200);
        System.out.println(account.getBalance());
        account.deposit(700);
        System.out.println(account.getBalance());
    }
}
