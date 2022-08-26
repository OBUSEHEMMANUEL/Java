package bike;

import bike.BikeUpdate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeUpdateTest {
    private BikeUpdate bike;
    @BeforeEach
    public void setUp(){
        bike = new BikeUpdate();
    }
    @Test
    public void bikeCanBeTurnedOnTest() {
        assertFalse(bike.isOn);

        bike.turnOn();
        assertTrue(bike.isOn());
    }
@Test
        public void bikeCanBeTurnedOffTest(){

        bike.turnOn();
          bike.turnOff();
        assertFalse(bike.isOn);
    }
    @Test
    public void bikeCanAccelerateOnGearOne(){

        bike.isOn();
        assertEquals(0,bike.getSpeed());

        bike.turnOn();
        assertEquals(1,bike.getGear());
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(4,bike.getSpeed());
    }
    @Test
    public void bikeWillNotAccelarateWhenTurnedOff(){
        assertFalse(bike.isOn());
        assertEquals(0,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(0,bike.getSpeed());

    }
    @Test
    public void bikeCanMoveFromGear1ToGear2(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(20,bike.getSpeed());
        assertEquals( 1,bike.getGear());
        bike.increaseSpeed();
        assertEquals(2,bike.getGear());
        assertEquals(21,bike.getSpeed());
    }
    @Test
    public void bikeCanAccelerateOnGearTwoTest(){
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2,bike.getGear());
        assertEquals(21,bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();

        assertEquals(25,bike.getSpeed());
        assertEquals(2,bike.getGear());
    }
    @Test
    public void bikeCanChangeFromGear2ToGear3(){
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29,bike.getSpeed());
        assertEquals(2,bike.getGear());

        bike.increaseSpeed();
        assertEquals(3,bike.getGear());
        assertEquals(31,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(34,bike.getSpeed());

    }
    @Test
    public void bikeCanChangeFromGear3ToGear4(){
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }
        assertEquals(40,bike.getSpeed());
        assertEquals(3,bike.getGear());

        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(43,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(47,bike.getSpeed());

    }
    @Test
    public void bikeCanDecelerateOnGearFour() {
        bike.turnOn();
        for (int i = 0; i < 29; i++){
            bike.increaseSpeed();
        }
            assertEquals(40,bike.getSpeed());
        assertEquals(3,bike.getGear());
        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(43,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(47,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(43,bike.getSpeed());
        bike.decreaseSpeed();
    }
    @Test
    public void bikeCanChangeFromGearFourTOGearThree(){
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }
        assertEquals(40,bike.getSpeed());
        assertEquals(3,bike.getGear());
        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(43,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(47,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(4,bike.getGear());
        assertEquals(43,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(39,bike.getSpeed());
        assertEquals(3,bike.getGear());
        bike.decreaseSpeed();
        assertEquals(36,bike.getSpeed());
        assertEquals(3,bike.getGear());
    }
    @Test
    public void bikeCanChangeFromGearThreeTOGearTwo(){
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29,bike.getSpeed());
        assertEquals(2,bike.getGear());

        bike.increaseSpeed();
        assertEquals(3,bike.getGear());
        assertEquals(31,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(3,bike.getGear());
        assertEquals(34,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(3,bike.getGear());
        assertEquals(31,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(28,bike.getSpeed());
        assertEquals(2,bike.getGear());
    }
    @Test
    public void bikeCanChangeFromGearTwoTOGearOne(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(20,bike.getSpeed());
        assertEquals( 1,bike.getGear());
        bike.increaseSpeed();
        assertEquals(2,bike.getGear());
        assertEquals(21,bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(2,bike.getGear());
        assertEquals(23,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(2,bike.getGear());
        assertEquals(21,bike.getSpeed());
        bike.decreaseSpeed();
        assertEquals(19,bike.getSpeed());
        assertEquals( 1,bike.getGear());
    }
    @Test
    public void bikeCanDecreaseOnGearOne(){
        bike.isOn();
        assertEquals(0,bike.getSpeed());

        bike.turnOn();
        assertEquals(1,bike.getGear());
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(4,bike.getSpeed());
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(2,bike.getSpeed());
    }
}