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
    public void test_isOff() throws Exception {
        String result = ac.isOff("off");
        Assertions.assertEquals(result, "off");
    }
}