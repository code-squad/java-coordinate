package model;

public class Line {

    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    //Math.abs는 절대값
    public int minusX() {
        return Math.abs(a.getX() - b.getX());
    }

    public int minusY() {
        return Math.abs(a.getY() - b.getY());
    }

    public int square(int num) {
        return num * num;
    }

    public double lineDistance() {
        int x = minusX();
        int y = minusY();
        return Math.sqrt(square(x) + square(y));
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
