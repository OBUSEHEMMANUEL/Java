package kelechiTest;

import Kelechi.Sub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubTest {
    Sub sub;
    @BeforeEach
    public void setup(){
            sub = new Sub();
    }
    @Test
    public void test_sub(){
        sub.setNumber(10,3);
        Assertions.assertEquals(7,sub.getNumber());
    }

}
