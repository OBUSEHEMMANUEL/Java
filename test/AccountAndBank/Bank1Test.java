package AccountAndBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Bank1Test {
    Bank1 uba;

    @BeforeEach
    public void setUp() {
        uba = new Bank1();
    }
    @Test
    public void testThatBankExist(){
        assertNotNull(uba);
    }
    @Test
    public void testAccountCanBeCreated(){
        uba.createAccountFor("Derek","3456");
        uba.createAccountFor("kelechi","5432");
assertEquals(2,uba.getNumberOfCustomers());
    }

    @Test
    public void findAccountNumber(){
        uba.createAccountFor("Derek","3456");
        assertEquals(1,uba.getNumberOfCustomers());
        assertEquals("Derek",uba.findAccountNumber("1").getAccountName());

 uba.createAccountFor("kelechi","4321");
      assertEquals(2,uba.getNumberOfCustomers());
        assertEquals("kelechi",uba.findAccountNumber("2").getAccountName());
    }
    @Test
    public void testDepositCanBeMade(){
        uba.createAccountFor("Derek","3456");
        assertEquals(1,uba.getNumberOfCustomers());
       uba.deposit(5000,"1");
       Account1 derekAccount = uba.findAccountNumber("1");
       assertEquals(5000,derekAccount.getBalance("3456"));
    }
    @Test
    public void testWithdrawalCanBeMade(){
        uba.createAccountFor("Derek","3456");
        assertEquals(1,uba.getNumberOfCustomers());
        uba.deposit(5000,"1");
        uba.withdrawal(2000,"1","3456");
        assertEquals(3000,uba.findAccountNumber("1").getBalance("3456"));
    }
}
