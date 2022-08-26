package Deitel.chapter_7Turtle;

public class Pen {
    private PenPosition position;
    public Pen(){
        position = position.UP;
    }

    public PenPosition getPosition() {

        return position;
    }

    public void setPosition(PenPosition position) {
        this.position = position;
    }
}
