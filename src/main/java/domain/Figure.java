package domain;

import java.util.*;

public class Figure {

    Points points;

    double area;

    Figure() { this.points = Points.of(); }

    public static Figure of() {
        return new Figure();
    }

    public static Figure of(List<String> coordinates) {
        return FigureFactory.create(coordinates);
    }

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public void calculate() { }

    public double getArea() {
        return area;
    }

}
