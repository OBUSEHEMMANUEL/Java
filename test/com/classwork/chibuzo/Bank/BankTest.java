package com.classwork.chibuzo.Bank;

import ac.Ac;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
  private   Bank wemaBank;
    @BeforeEach
    public void setUp(){
         wemaBank = new Bank();
    }
@Test
    public void test_bankExist(){

    assertNotNull(wemaBank);
//    assertNotEquals(null,wemaBank);
//    assertEquals(wemaBank,wemaBank);
}
@Test
    public void test_accountCanBeCreated(){
        wemaBank.createAccountFor("Banke Celina Owolabi", "2727");
        assertEquals(1, wemaBank.getNumberOFCustomers());
}
@Test
    public void createAccount_findAccountNumberTest(){
    wemaBank.createAccountFor("Banke Celina Owolabi", "2727");


    assertEquals(2, wemaBank.getNumberOFCustomers());
    Account account = wemaBank.findAccount("1");
    assertEquals("Banke Celina Owolabi",account.getAccountName());

}
@Test
    public void customerDepositInHerAccount(){
        wemaBank.createAccountFor("Banke celina owolabi", "2727");
        wemaBank.deposit(2000,"1");
    Account bankeAccount = wemaBank.findAccount("1");
    assertEquals(2000,bankeAccount.getBalance("2727"));
}
@Test
    public void customerCanWithdrawFromAccount(){
    wemaBank.createAccountFor("Banke celina owolabi", "2727");

    wemaBank.deposit(2000,"1");
    Account bankeAccount = wemaBank.findAccount("1");

    wemaBank.withdrawal(1000,"1","2727");
 assertEquals(1000,bankeAccount.getBalance("2727"));

}
@Test
    public void bankTransferFundsTest(){
    wemaBank.createAccountFor("Hadiza", "Needle");
    wemaBank.createAccountFor("Hopeson", "thread");
    wemaBank.deposit(2000,"1");
    assertEquals(2000,wemaBank.findAccount("1").getBalance("Needle"));
    wemaBank.transfer("1","2",1700,"Needle");
    assertEquals(300,wemaBank.findAccount("1").getBalance("Needle"));
    assertEquals(1700,wemaBank.findAccount("2").getBalance("thread"));

}
}