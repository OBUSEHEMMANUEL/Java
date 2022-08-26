package AccountAndBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account1 account;
    Account1 derekAccount;
    @BeforeEach
    public void setUp(){
        account = new Account1("DEREK","1","3456");
        derekAccount = new Account1("DEREK","1","3456");
    }
    @Test
    public void checkBalanceTest(){
        assertNotNull(account);
        assertEquals(0, account.getBalance("3456"));
    }
@Test
    public void checkDepositCanBeMadeInAccount(){
        account.deposit(5000,"1");
        assertEquals(5000,account.getBalance("3456"));
}
@Test
    public void checkNegativeDepositCannotBeMade(){
        account.deposit(-2000,"1");
        assertEquals(0,account.getBalance("3456"));
}
@Test
    public void testForWithdrawal(){
        account.deposit(5000,"1");
        account.withdraw(2000,"1","3456");
        assertEquals(3000,account.getBalance("3456"));
}
@Test
    public void testForNagetiveWithdrawal(){
        account.deposit(5000,"1");
        account.withdraw(-5000,"1","3456");
        assertEquals(5000,account.getBalance("3456"));
}
@Test
    public void testForCannotWithdrawMoreThanAvailableBalance(){
        account.deposit(5000,"1");
        account.withdraw(6000,"1","3456");
        assertEquals(5000,account.getBalance("3456"));
}
}