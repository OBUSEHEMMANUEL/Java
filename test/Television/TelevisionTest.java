package Television;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TelevisionTest {
    Television television;

    @BeforeEach
    public void setUp() {
        television = new Television();
    }

    @Test
    public void televisionCanTurnOnTest() {
        television.turnOn();
        assertTrue(television.isOn());
    }

    @Test
    public void televisionCanTurnOffTest() {
        television.turnOn();
        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void televisionCanChangeChannelForward() {
        television.turnOn();
        television.channelForward();
        assertEquals(1, television.getChangeChannel());

    }

    @Test
    public void televisionWhenIn100ShouldGoBackTo0() {
        television.turnOn();
        for (int i = 0; i < 101; i++) {
            television.channelForward();
        }
        assertEquals(0, television.getChangeChannel());

    }

    @Test
    public void televisionCanChangeChannelBackward() {
        television.turnOn();
        for (int i = 0; i < 60; i++) {
            television.channelForward();
        }
        television.channelBackward();
        assertEquals(59, television.getChangeChannel());
    }

    @Test
    public void televisionWhenIn0ShouldGoBackTo100() {
        television.turnOn();
        television.channelBackward();
        assertEquals(100,television.getChangeChannel());
}
@Test
    public void televisionCanBeSetTest(){
        television.turnOn();
        television.setChangeChannel(101);
    assertEquals(0,television.getChangeChannel());
    television.positiveChangeChannel();
    assertEquals(1,television.getChangeChannel());
}
@Test
    public void televisionCanIncreaseVolume(){
        television.turnOn();
        television.volumePlus();
        assertEquals(1,television.getVolume());
}
@Test
public void televisionCanReduceVolume(){
        television.turnOn();
    television.increaseVolume();
    television.increaseVolume();
    television.increaseVolume();
        television.decreaseVolume();
        assertEquals(2,television.getVolume());
}
@Test
    public void muteTest(){
        television.turnOn();
    television.increaseVolume();
    television.increaseVolume();
        television.mute();
        assertTrue(true);
      assertEquals(0,television.getVolume());
      television.unMute();
    assertEquals(2,television.getVolume());
assertFalse(false);

}



}



