package Deitel.chapter_7;

import Deitel.chapter_7Turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle ijapa;
    @BeforeEach
    public void setup(){
        ijapa = new Turtle();
    }
    @Test
    public void TurtleHasPen(){
        assertNotNull(ijapa);
        assertNotNull(ijapa.getTurtlePen());

    }
    @Test
    public void turtlePenIsUp(){
        assertNotNull(ijapa);
        assertNotNull(ijapa.getTurtlePen());
        assertNotNull(ijapa.getTurtlePen().getPosition());

       // assertEquals(PenPosition.UP, ijapa.getTurtlePen());

    }
//    @Test
//    public void moveForward(){
//        turtlePenIsUp();
//        ijapa.mo
//    }
//
}
