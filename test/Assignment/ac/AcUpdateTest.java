package Assignment.ac;

import ac.AcUpdate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AcUpdateTest {
    AcUpdate acUpdate;

    @BeforeEach
    public void setUp() {
        acUpdate = new AcUpdate();
    }

    @Test
    public void acCanBeTurnedOnTest() {
        assertFalse(acUpdate.isOn());

        acUpdate.turnOn();
        assertTrue(acUpdate.isOn);
    }

    @Test
    public void acCanBeTurnedOffTest() {
        acUpdate.turnOn();
        assertTrue(acUpdate.isOn);

        acUpdate.turnOff();
        assertFalse(acUpdate.isOn);
    }

    @Test
    public void acCanIncreaseWhenTurnedOnTest() {
        acUpdate.turnOn();
        acUpdate.increaseAc();
        assertEquals(17, acUpdate.getTemp());
        acUpdate.increaseAc();
        acUpdate.increaseAc();
        assertEquals(19, acUpdate.getTemp());
    }

    @Test
    public void acCannotIncreaseWhenTurnedOffTest() {
        acUpdate.turnOff();
        acUpdate.increaseAc();
        assertEquals(16, acUpdate.getTemp());
    }

    @Test
    public void acWillRemainInTheTempStateItWasWhenTurnedOff() {
        acUpdate.turnOn();
        acUpdate.increaseAc();
        acUpdate.increaseAc();
        assertEquals(18, acUpdate.getTemp());
        acUpdate.turnOff();
        acUpdate.turnOn();
        assertEquals(18, acUpdate.getTemp());

    }

    @Test
    public void tempCannotExceed30() {
        acUpdate.turnOn();
        for (int i = 0; i < 18; i++) {
            acUpdate.increaseAc();
        }
        assertEquals(30, acUpdate.getTemp());

    }

    @Test
    public void tempCanDecrease() {
        acUpdate.turnOn();
        for (int i = 0; i < 12; i++) {
            acUpdate.increaseAc();
        }
        assertEquals(28, acUpdate.getTemp());
        acUpdate.decreaseAc();
        assertEquals(27, acUpdate.getTemp());
        acUpdate.decreaseAc();
        acUpdate.decreaseAc();
        acUpdate.decreaseAc();
        acUpdate.decreaseAc();
        assertEquals(23, acUpdate.getTemp());
    }
@Test
    public void tempCannotReduceMoreThan16(){
    acUpdate.turnOn();
    for (int i = 0; i < 2; i++) {
        acUpdate.increaseAc();
    }
    assertEquals(18, acUpdate.getTemp());
    for (int i = 0; i < 6; i++) {
        acUpdate.decreaseAc();
    }
    assertEquals(16, acUpdate.getTemp());
}

}