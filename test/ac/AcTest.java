package ac;

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
        String result = ac.isOn("on");
        Assertions.assertEquals(result, "on");

    }
    @Test
    public void test_isOnInvalid() throws Exception {
        String result = ac.isOn("OFF");
        Assertions.assertEquals(result, "OFF");

    }
    @Test
    public void test_isOff() throws Exception {
        String result = ac.isOff("off");
        Assertions.assertEquals(result, "off");
    }
    @Test
    public void test_isOffInvalid() throws Exception {
        String result = ac.isOff("ON");
        Assertions.assertEquals(result, "ON");
    }
    @Test
    public void test_increaseTemp() throws Exception {
        int result = ac.increaseTemp(20);
        Assertions.assertEquals(result,20 );
    }
    @Test
    public void test_increaseTempInavlid() throws Exception {
        int result = ac.increaseTemp(40);
        Assertions.assertEquals(result,40);
    }
    @Test
    public void test_decreaseTemp() throws Exception {
        int result = ac.decreaseTemp(16);
        Assertions.assertEquals(result,16);
    }
    @Test
    public void test_decreaseTempInvalid() throws Exception {
        int result = ac.decreaseTemp(1);
        Assertions.assertEquals(result,1);
    }
}