package model;

import java.util.List;

public class Line extends AbstractFigures {

    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public Point getA(int x) {
        return points.get(x);
    }

    public Point getB(int y) {
        return points.get(y);
    }

    //Math.abs는 절대값
    public int minusX() {
        return Math.abs(getA(0).minusXaxis(getB(1)));
    }

    public int minusY() {
        return Math.abs(getA(0).minusYaxis(getB(1)));
    }

    @Override
    public double getValue() {
        int x = minusX();
        int y = minusY();
        return Math.sqrt(pow(x) + pow(y));
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }
}
