package kelechiTest;

import Kelechi.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {
    Sum sum;
    @BeforeEach
    public void setup(){
        sum = new Sum();
    }
    @Test
    public void testCal(){
        sum.setNumber(5,5);
        Assertions.assertEquals(10,sum.getNumber());
    }

}
