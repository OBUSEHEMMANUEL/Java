package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit money, balance increases test")
    public void depositMoneyBalanceIncreasesTest() {
        Account jennyAccount = new Account();

        jennyAccount.deposit(500);

        assertEquals(500, jennyAccount.getBalance());


    }


    //todo create test for negative deposit

    @Test
    public void withdrawWorkstest() {

        Account jennyAccount = new Account();
        jennyAccount.deposit(5000);

        jennyAccount.withdraw(2000);

        assertEquals(3000, jennyAccount.getBalance());

    }
}





