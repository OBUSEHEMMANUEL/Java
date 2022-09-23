package turtle;

import static turtle.Direction.*;

public class Turtle {
    public boolean isPenUp;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);
    public Direction getCurrentDirection(){
        return  currentDirection;
    }

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp(){
        return  isPenUp;
    }
    public void penDown() {
        isPenUp = false;
    }

    public void turnRight() {
        if(currentDirection == EAST)  face(SOUTH);
       else if(currentDirection == SOUTH) face(WEST);
       else if(currentDirection == WEST) face(NORTH);
       else if(currentDirection == NORTH) face(EAST);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if(currentDirection == EAST) face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face(EAST);
    }
    public Position getCurrentPosition() {
        return currentPosition;
    }
    private void move(int numberOfSteps) {
        if(currentDirection == NORTH) currentPosition.setRow(currentPosition.getRow() - numberOfSteps);
        else if(currentDirection == WEST) currentPosition.setColumn(currentPosition.getColumn() - numberOfSteps);
        else if(currentDirection == SOUTH) currentPosition.setRow(currentPosition.getRow() + numberOfSteps );
        else if(currentDirection == EAST) currentPosition.setColumn(currentPosition.getColumn() + numberOfSteps);
    }
    public void move(int numberOfSteps, Sketchpad sketchPad) {
        numberOfSteps = numberOfSteps -1;
        if (!isPenUp) writeOn(sketchPad, numberOfSteps);
        move(numberOfSteps);
    }

    private void writeOn(Sketchpad sketchPad, int numberOfSteps) {
        var floor = sketchPad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        if(currentDirection == EAST) {
            for (int i = 0; i <= numberOfSteps; i++) {
                floor[currentRow][currentColumn++] = 1;
            }
        }
           else if(currentDirection == SOUTH) {
                for (int i = 0; i <= numberOfSteps; i++) {
                    floor[currentRow++][currentColumn] = 1;
                }

        }
        else if(currentDirection == WEST) {
            for (int i = 0; i <= numberOfSteps; i++) {
                floor[currentRow][currentColumn--] = 1;
            }
        }
        else if(currentDirection == NORTH) {
            for (int i = 0; i <= numberOfSteps; i++) {
                floor[currentRow--][currentColumn] = 1;
            }

        }

    }


}
