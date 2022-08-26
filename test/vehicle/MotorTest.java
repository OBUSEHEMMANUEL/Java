package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotorTest {
    private Motor motor;

    @BeforeEach
    public void initiateSetup() {
        motor = new Motor();
    }

    @Test
    public void test_getAndSetBrands() {
        motor.setBrands("bens");
        String result = motor.getBrands();
        Assertions.assertEquals(result, "bens");
    }

    @Test
    public void test_getAndSetPlateNumber() {
        motor.setplateNumber("SIR E");
        String result = motor.getBrands();
        Assertions.assertEquals(result, "SIR E");
    }

    @Test
    public void test_getAndSetColor() {
        motor.setColor("BLUE");
        String result = motor.getColor();
        Assertions.assertEquals(result, "BLUE");

    }

    @Test
    public void test_getAndSetBrake() {
        motor.setBrake("STOP");
        String result = motor.getBrake();
        Assertions.assertEquals(result, "STOP");

    }

    @Test
    public void test_accelerateGearOne() throws Exception {
        int gearAtOne = motor.gearOne(1, 18);
        Assertions.assertEquals(gearAtOne, 19);
    }

    @Test
    public void test_GearTwo() throws Exception {
        int gearAtTwo = motor.gearTwo(2, 23);
        Assertions.assertEquals(gearAtTwo, 25);
    }

    @Test
    public void test_GearThree() throws Exception {
        int gearAtThree = motor.gearThree(3, 35);
        Assertions.assertEquals(gearAtThree, 38);

    }
    @Test
    public void test_gearFour() throws Exception {
        int gearAtFour = motor.gearFour(4, 40);
        Assertions.assertEquals(gearAtFour, 44);

    }
}