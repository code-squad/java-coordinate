package model;

import java.util.List;

public class Line extends AbstractFigures {

    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public Point getA() {
        return points.get(0);
    }

    public Point getB() {
        return points.get(1);
    }

    //Math.abs는 절대값
    public int minusX() {
        return Math.abs(getA().getX() - getB().getX());
    }

    public int minusY() {
        return Math.abs(getA().getY() - getB().getY());
    }

    public int square(int num) {
        return num * num;
    }

    @Override
    public double getValue() {
        int x = minusX();
        int y = minusY();
        return Math.sqrt(square(x) + square(y));
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + getA() +
                ", b=" + getB() +
                '}';
    }
}
