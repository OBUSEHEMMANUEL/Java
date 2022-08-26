package com.classwork.chibuzo.Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
private Account account;
private Account bankeAccount;

@BeforeEach
public void setup(){
    account = new Account("1","Banke","1234");
     bankeAccount = new Account("1", "Banke", "1234");
}


    @Test
    public void accountCanBeCreatedTest(){

        assertNotNull(account);
        assertEquals(0,account.getBalance("1234"));
    }
    @Test
    public void test_depositMoney_balanceIncreaseTest() {
        assertEquals(0,bankeAccount.getBalance("1234"));
        bankeAccount.deposit(2000);
        assertEquals(2000, bankeAccount.getBalance("1234"));

    }
//    @Test
//    public void cannotDepositNegativeAmountTest(){
//
//        assertEquals(0,bankeAccount.getBalance("1234"));
//        bankeAccount.deposit(-2500);
//        assertEquals("YOU CANNOT DEPOSIT A NEGATIVE AMOUNT", bankeAccount.getBalance("1234"));
//    }
    @Test
    public void cannotWithdrawMoreThanAmountThrowsExceptionTest(){
    assertThrows(InsufficientFundException.class,()->bankeAccount.withdraw(3000,"1234"));
    }
    @Test
    public void cannotWithrawWithWrongPinThrowExceptionTest(){
    bankeAccount.deposit(5000);
    assertThrows(InvalidPinException.class,()->bankeAccount.withdraw(3000,"4321"));
    }
    @Test
    public void depositNegativeAmountThrowsExceptionTest(){
    assertThrows(InvalidAmountException.class,()->bankeAccount.deposit(-2500));
    }
    @Test
    public void getBalanceWithWrongPin_returnsZeroTest(){
bankeAccount.deposit(2000);
int myBalance = bankeAccount.getBalance("1234");
assertEquals(2000,myBalance);

    }
    @Test
    public void test_withdrawMoney_balanceDecrease(){
        bankeAccount.deposit(2000);
    bankeAccount.withdraw(1500,"1234");
    assertEquals(500,bankeAccount.getBalance("1234"));
    }

//    @Test
//    public void test_withdrawMoney_withRightPin(){
//        bankeAccount.deposit(2000);
//        bankeAccount.withdraw(1500,"1230");
//        assertEquals(2000,bankeAccount.getBalance("1234"));
//    }
}
//    @Test
//    public void test_userCannotwithdrawMoreThanTheyHave(){
//    bankeAccount.deposit(2000);
//    bankeAccount.withdraw(5000,"1234");
//    assertEquals(2000,bankeAccount.getBalance("1234"));
//    }
//}