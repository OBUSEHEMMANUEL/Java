package Deitel.Chapter_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClockTest {
 Clock clock;
 @BeforeEach
    public void intiateTest() {
     clock = new Clock(0,20,10);
 }
 @Test
    public void testHour(){
     assertEquals(0,clock.getHour());
 }
 @Test
    public void testMinute() {
     assertEquals(20, clock.getMinute());
 }
@Test
    public void testSecond(){
     assertEquals(10,clock.getSecond());
}
}
