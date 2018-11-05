package model;

import java.util.List;


public class Triangle extends AbstractFigures{

private List<Point> points;

    public Triangle(List<Point> point) {
        this.points = point;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
