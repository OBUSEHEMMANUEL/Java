package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void initiateTest() {
        bike = new Bike();

    }

    @Test
    public void test_isOn() throws Exception {
        String result = bike.isOn("on");
        Assertions.assertEquals(result, "on");
    }

    @Test
    public void test_isOnInvalid() throws Exception {
        String result = bike.isOn("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void test_isOff() throws Exception {
        String result = bike.isOff("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void test_isOffInvalid() throws Exception {
        String result = bike.isOff("on");
        Assertions.assertEquals(result, "on");
    }

    @Test
    public void test_accelerateGearOne() throws Exception {
        int gearAtOne = bike.accelerateGearOne(1, 18);
        Assertions.assertEquals(gearAtOne, 19);
    }

    @Test
    public void test_accelerateGearOneInvalid() throws Exception {
        int gearAtOne = bike.accelerateGearOne(1, 24);
        Assertions.assertEquals(gearAtOne, 26);
    }

    @Test
    public void test_accelerateGearTwo() throws Exception {
        int gearAtTwo = bike.accelerateGearTwo(2, 22);
        Assertions.assertEquals(gearAtTwo, 24);

    }

    @Test
    public void test_accelerateGearTwoInvalid() throws Exception {
        int gearAtTwo = bike.accelerateGearTwo(2, 40);
        Assertions.assertEquals(gearAtTwo, 44);

    }

    @Test
    public void test_accelerateGearThree() throws Exception {
        int gearAtThree = bike.accelerateGearThree(3, 35);
        Assertions.assertEquals(gearAtThree, 38);

    }

    @Test
    public void test_accelerateGearThreeInvalid() throws Exception {
        int gearAtThree = bike.accelerateGearThree(3, 20);
        Assertions.assertEquals(gearAtThree, 21);

    }

    @Test
    public void test_accelerateGearFour() throws Exception {
        int gearAtFour = bike.accelerateGearFour(4, 40);
        Assertions.assertEquals(gearAtFour, 44);

    }

    @Test
    public void test_accelerateGearFourInvalid() throws Exception {
        int gearAtThree = bike.accelerateGearFour(4, 23);
        Assertions.assertEquals(gearAtThree, 25);
    }
    @Test
    public void test_decelerateGearOne() throws Exception {
        int gearAtThree = bike.decelerateGearOne(1, 6);
        Assertions.assertEquals(gearAtThree, 5);
    }
    @Test
    public void test_decelerateGearOneInvalid() throws Exception {
        int gearAtThree = bike.decelerateGearOne(2, 32);
        Assertions.assertEquals(gearAtThree, 30);
    }
    @Test
    public void test_decelerateGearTwo() throws Exception {
        int gearAtTwo = bike.decelerateGearTwo(2, 25);
        Assertions.assertEquals(gearAtTwo, 23);

    }
    @Test
    public void test_decelerateGearTwoInvalid() throws Exception {
        int gearAtTwo = bike.decelerateGearTwo(3, 22);
        Assertions.assertEquals(gearAtTwo, 20);

    }
    @Test
    public void test_decelerateGearThree() throws Exception {
        int gearAtThree = bike.decelerateGearThree(3, 35);
        Assertions.assertEquals(gearAtThree, 32);

    }
    @Test
    public void test_decelerateGearThreeInvalid() throws Exception {
        int gearAtThree = bike.decelerateGearThree(3, 35);
        Assertions.assertEquals(gearAtThree, 32);

    }
    @Test
    public void test_decelerateGearFour() throws Exception {
        int gearAtFour = bike.decelerateGearFour(4, 46);
        Assertions.assertEquals(gearAtFour, 42);

    }
    @Test
    public void test_decelerateGearFourInvalid() throws Exception {
        int gearAtFour = bike.decelerateGearFour(4, 30);
        Assertions.assertEquals(gearAtFour, 26);
    }
}