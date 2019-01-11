package coordinates.domain;

import java.util.List;

public class Rectangle {

    private List<Point> point;

    public List<Point> getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point=" + point +
                '}';
    }
}
