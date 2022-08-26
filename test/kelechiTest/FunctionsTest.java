package kelechiTest;

import Kelechi.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FunctionsTest {
    Functions sub;
    @BeforeEach
    public void setup(){
        sub = new Functions();
    }
    @Test
    public void test_fuctionThatAddNumbers(){
        sub.setFunctionsThatAddNumbers(10);
        Assertions.assertEquals(11,sub.getFunctionThatAddNumbers());
    }


}
