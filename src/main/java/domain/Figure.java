package domain;

import java.util.*;

public class Figure {

    Points points;

    double area;

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public void calculate() { }

    public double getArea() {
        return area;
    }

    public static Figure createFigure(List<String> coordinates){
        return null;
    };

}
