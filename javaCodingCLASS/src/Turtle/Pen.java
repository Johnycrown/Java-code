package Turtle;
//import static

public class Pen {
    private PenPosition penPosition = PenPosition.UP;

    public PenPosition getPosition() {

        //return PenPosition.UP;
        return penPosition;
    }

    public void setPosition(PenPosition currentPosition) {
        penPosition = currentPosition;
    }
}
