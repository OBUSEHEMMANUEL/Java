import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionTest {
    private Aircondition ac;
    @BeforeEach
    public void initiateSetup(){
        ac = new Aircondition();

    }
    @Test
    public void Test_Aircondition() throws Exception {
        String Result = ac.isOn("on");
        Assertions.assertEquals(Result,"on");
    }

}