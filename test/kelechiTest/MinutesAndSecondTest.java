package kelechiTest;

import Kelechi.MinutesAndSeconds;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinutesAndSecondTest {
    MinutesAndSeconds time ;
    @BeforeEach
    public void setup(){
        time = new MinutesAndSeconds(3);
    }
    @Test
    public void testMinutesAndSecond(){

        Assertions.assertEquals(180,time.calMinAndSec());
    }
}
