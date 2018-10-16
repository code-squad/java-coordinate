package coordinate.figure;

import coordinate.Point;

import java.util.*;

public class Rectangle extends Figure {

    public Rectangle(List<Point> points) {
        super(points);
    }


    public void checkRectangle() throws IllegalArgumentException {
        for (int i = 0; i < getPoints().size(); i++) {
            if (!isRectangle(i))
                throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    private Boolean isRectangle(int i) {
        int x = 0;
        int y = 0;
        for (int j = 0; j < getPoints().size(); j++) {
            if (getPoints().get(i).matchX(getPoints().get(j)))
                x++;
            if (getPoints().get(i).matchY(getPoints().get(j)))
                y++;
        }
        return x == 2 && y == 2;
    }

    @Override
    public double area() throws IllegalArgumentException {
        checkRectangle();
        List<Double> lengths = oneLength();
        Collections.sort(lengths);
        return lengths.get(0) * lengths.get(1);
    }

    @Override
    public String name() {
        return "직사각형의 넓이는 ";
    }

    @Override
    public String toString() throws IllegalArgumentException {
        return name() + area();
    }

}
