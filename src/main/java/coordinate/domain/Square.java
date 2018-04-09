package coordinate.domain;

import java.util.ArrayList;

public class Square extends Figure{

    public Square(ArrayList<String> points) {
        super(points);
    }

    private int width() {
        return (int)super.getPoint(0).length(super.getPoint(1));
    }

    private int height() {
        return (int) super.getPoint(1).length(super.getPoint(2));
    }

    public int area() {
        return width() * height();
    }

}
