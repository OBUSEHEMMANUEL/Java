package turtleTest;


import Deitel.chapter_7Turtle.SketchPad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.*;
import turtle.Position;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    Turtle turtle;
    Sketchpad sketchPad;
    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
        sketchPad  = new Sketchpad(5,5);
    }

    @Test
    public void thereIsATurtle() {
assertNotNull(turtle);
    }

    @Test
    public void turtleCanMovePenUp() {
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDown() {
        turtle.penUp();
        assertTrue(turtle.isPenUp());

        turtle.penDown();
        assertFalse(turtle.isPenUp);

    }

    @Test
    public void turtleCanTurnRight() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_WhileFacingSouthTest() {
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRight_WhileFacingWestTest() {
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());

    }
//todo turn turtle right facing west to north
@Test
public void turtleCanTurnLeft_whileFacingEastTest() {
    assertEquals(EAST, turtle.getCurrentDirection());
    turtle.turnLeft();
    assertEquals(NORTH, turtle.getCurrentDirection());
}
    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

//todo turn turtle left facing west to south

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveWhileFacingEastTest() {
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.penUp();
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingEast(){
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.penUp();
        turtle.move(3, sketchPad);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(SOUTH, turtle.getCurrentDirection());
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.move(3,sketchPad);
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(2,4),turtle.getCurrentPosition());
    }
    @Test
    public void turtleCanTurnRightTwice(){
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.penUp();
        turtle.move(3, sketchPad);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(3, sketchPad);
        assertEquals(SOUTH, turtle.getCurrentDirection());
        assertEquals(new Position(2,2),turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.move(3, sketchPad);
        assertEquals(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(2,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanWriteWhenPenIsDownFacingSouthTest() {
        turtle.penDown();
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp);
        turtle.move(3, sketchPad);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        turtle.turnRight();
        turtle.move(3, sketchPad);
        assertEquals(new Position(2, 2), turtle.getCurrentPosition());
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);
        sketchPad.displayFloor();
    }
    @Test
    public void turtleCanWriteWhenPenIsDownFacingEastTest() {
        turtle.penDown();
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp);
        turtle.move(3, sketchPad);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
        sketchPad.displayFloor();
    }
    @Test
        public void turtleCanWriteWhenPenIsDownFacingWestTest() {
            turtle.penDown();
            assertEquals(new Position(0, 0), turtle.getCurrentPosition());
            assertFalse(turtle.isPenUp);
            turtle.move(3, sketchPad);
            assertEquals(new Position(0, 2), turtle.getCurrentPosition());
            int[][] floor = sketchPad.getFloor();
            assertEquals(1, floor[0][0]);
            assertEquals(1, floor[0][1]);
            assertEquals(1, floor[0][2]);
            assertEquals(0, floor[0][3]);

            turtle.turnRight();
            turtle.move(3, sketchPad);
            assertEquals(new Position(2, 2), turtle.getCurrentPosition());
            assertEquals(1, floor[0][2]);
            assertEquals(1, floor[1][2]);
            assertEquals(1, floor[2][2]);
            assertEquals(0, floor[3][2]);

            turtle.turnRight();
            turtle.move(3, sketchPad);
            assertEquals(new Position(2, 0), turtle.getCurrentPosition());

            assertEquals(0, floor[2][3]);
            assertEquals(1, floor[2][2]);
            assertEquals(1, floor[2][1]);
            assertEquals(1, floor[2][0]);
            sketchPad.displayFloor();
        }
    @Test
    public void turtleCanWriteWhenPenIsDownFacingNorthTest() {
        turtle.penDown();
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp);
        turtle.move(3, sketchPad);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        turtle.turnRight();
        turtle.move(3, sketchPad);
        assertEquals(new Position(2, 2), turtle.getCurrentPosition());
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);

        turtle.turnRight();
        turtle.move(3, sketchPad);
        assertEquals(new Position(2, 0), turtle.getCurrentPosition());

        assertEquals(0, floor[2][3]);
        assertEquals(1, floor[2][2]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][0]);
        turtle.turnRight();
        turtle.move(3,sketchPad);
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
        assertEquals(0, floor[3][0]);
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[0][0]);

        sketchPad.displayFloor();
    }

}

