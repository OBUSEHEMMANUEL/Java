package creditCardValidation;

import static creditCardValidation.Card.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardValidationTest {
    CreditCardValidation creditCardValidation;
    @BeforeEach
    public void setUp(){
        creditCardValidation = new  CreditCardValidation();
    }
    @Test
    public void lengthOfDigitsTest(){
  creditCardValidation.setDigits(4388576018410707L);

  assertEquals(4388576018410707L,creditCardValidation.getDigits());
    }
    @Test
    public  void convertFromLongToString(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals("4388576018410707",creditCardValidation.getNum());
    }
    @Test
    public void lengthOfDigitIsBetweenTest13To16(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals(16,creditCardValidation.numLength());
    }
    @Test
    public void sumEvenNumberTest(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals(29,creditCardValidation.sumEvenDigits());
    }
    @Test
    public void sumOddNumberTest(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals(41,creditCardValidation.sumOddDigits());
    }
    @Test
    public void sumOddAndEvenTest(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals(70,creditCardValidation.totalSum());
    }
    @Test
    public void isValidTest(){
        creditCardValidation.setDigits(4388576018410707L);
       assertTrue(creditCardValidation.isValid());
    }
@Test
    public void VisaCardIsEqualTo4(){
        creditCardValidation.setDigits(4388576018410707L);
        assertEquals(VISA,creditCardValidation.getCardType());
}
//    @Test
//    public void MASTERCardIsEqualTo5(){
//        creditCardValidation.setDigits(5388576018410707L);
//        assertEquals(MASTER,creditCardValidation.getCardType());
//    }
//    @Test
//    public void DISCOVERYCardIsEqualTo6(){
//        creditCardValidation.setDigits(6388576018410707L);
//        assertEquals(DISCOVERY,creditCardValidation.getCardType());
//    }
//
//    @Test
//    public void AMERICANCardIsEqualTo37(){
//        creditCardValidation.setDigits(3788576018410707L);
//        assertEquals(AMERICAN,creditCardValidation.getCardType());
//    }
}
