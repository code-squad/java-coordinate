package model;

import java.util.List;

public class Triangle extends AbstractFigures {

    private List<Point> points;

    public Triangle(List<Point> point) {
        this.points = point;
    }

    public double extent(double a, double b, double c) {
        double s = calcWidth(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calcWidth(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double makeLine(int num) {
        if (num < 2) {
            return points.get(num).makeLine(points.get(num + 1));
        }
        if (num == 2) {
            return points.get(2).makeLine(points.get(0));
        }
        throw new IllegalArgumentException(" 삼각형이 아닙니다. ");
    }

    @Override
    public double getValue() {
        double a = makeLine(0);
        double b = makeLine(1);
        double c = makeLine(2);
        return extent(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + points +
                '}';
    }

}
