package kelechiTest;

import Kelechi.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArgumentTest {
    Argument argument ;
    @BeforeEach
    public void setUp(){
        argument = new Argument();
    }
    @Test
    public void testFunction(){
        argument.function1("kelechi");
        assertNotNull("e");
    }
    @Test
    public void testFunction2(){
        assertEquals("B" , argument.letter("A"));
    }
}
