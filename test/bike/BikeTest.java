package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void initiateTest() {
        bike = new Bike();

    }

    @Test
    public void test_isOn() throws Exception {
        String result = bike.isOn("on");
        assertEquals(result, "on");
    }


    @Test
    public void test_isOff() throws Exception {
        String result = bike.isOff("off");
        assertEquals(result, "off");
    }



    @Test
    public void test_accelerateGearOne() throws Exception {
        int gearAtOne = bike.accelerateGearOne(1, 18);
        assertEquals(gearAtOne, 19);
    }



    @Test
    public void test_accelerateGearTwo() throws Exception {
        int gearAtTwo = bike.accelerateGearTwo(2, 22);
        assertEquals(gearAtTwo, 24);

    }


    @Test
    public void test_accelerateGearThree() throws Exception {
        int gearAtThree = bike.accelerateGearThree(3, 35);
        assertEquals(gearAtThree, 38);


    }

    @Test
    public void test_accelerateGearFour() throws Exception {
        int gearAtFour = bike.accelerateGearFour(4, 40);
        assertEquals(gearAtFour, 44);

    }

    @Test
    public void test_decelerateGearOne() throws Exception {
        int gearAtThree = bike.decelerateGearOne(1, 6);
        assertEquals(gearAtThree, 5);
    }
    @Test
    public void test_decelerateGearTwo() throws Exception {
        int gearAtTwo = bike.decelerateGearTwo(2, 25);
        assertEquals(gearAtTwo, 23);

    }
    @Test
    public void test_decelerateGearThree() throws Exception {
        int gearAtThree = bike.decelerateGearThree(3, 35);
        assertEquals(gearAtThree, 32);

    }
    @Test
    public void test_decelerateGearFour() throws Exception {
        int gearAtFour = bike.decelerateGearFour(4, 46);
        assertEquals(gearAtFour, 42);

    }
}