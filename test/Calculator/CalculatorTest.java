package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

        private Calculator y;

        @BeforeEach
        public void initialSetup(){
            y = new Calculator();
        }

        @Test
        public void test_addTwoNumber(){
               int result = y.addTwoNumber(4,2);
                Assertions.assertEquals(result,6);
        }
        @Test
        public void test_substractTwoNumber(){
           int result = y.substractTwoNumber(4,2);
                Assertions.assertEquals(result,2);
        }
        @Test
        public void test_divideTwoNumber(){
                int result = y.divideTwoNumber(4,2);
                Assertions.assertEquals(result,2);
        }
        @Test
        public void test_multiplyTwoNumber(){
                int result = y.multiplyTwoNumber(4,2);
                Assertions.assertEquals(result,8);
        }

        }
