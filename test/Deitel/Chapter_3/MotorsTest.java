package Deitel.Chapter_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorsTest {
    Motors motor;

    @BeforeEach
    public void initiateMotors() {
        motor = new Motors("Bens", "2022", -1000);
    }

    @Test
    public void testModel() {assertEquals("Bens", motor.getModel());
    }
    @Test
    public  void testYear(){
        assertEquals("2022",motor.getYear());

    }
    @Test
    public void testPrice(){
        assertEquals(0.0,motor.getPrice());
    }

}
