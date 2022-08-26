package testdriller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDrillerTest {

    @Test
    public void Tester() {
        TestDriller testdriller = new TestDriller();
        Assertions.assertEquals(4000,testdriller.copyRange1(2));
    }


}