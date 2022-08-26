package Assignment.ac;

import ac.Ac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {

    private Ac ac;

    @BeforeEach

    public void initiatesetup(){
        ac = new Ac();
    }

    @Test
    public void test_isOn() throws Exception {
        ac.isOn("on");
        Assertions.assertNotNull(ac.getIsOn());

    }

    @Test
    public void test_isOff() throws Exception {
        ac.isOff("off");
        Assertions.assertNotNull( ac.getIsOff());
    }

    @Test
    public void test_increaseTemp() {
        int result =  ac.increaseTemp();

        Assertions.assertEquals(19,result);
    }
    @Test
    public void test_increaseTempNotAbove30() throws Exception {
        int result =  ac.increaseTemp();

        Assertions.assertEquals( 19 ,result);
    }
        @Test
        public void test_decreaseTemp () throws Exception {
            int result = ac.decreaseTemp();
            Assertions.assertEquals(result, 17);
        }
        @Test
        public void test_decreaseTempNotBelow16() throws Exception {
            int result = ac.decreaseTemp();
            Assertions.assertEquals(result, 17);

        }
    }
