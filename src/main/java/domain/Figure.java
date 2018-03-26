package domain;

public abstract class Figure {

    Points points;

    double area;

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public abstract void calculate();

    public double getArea() {
        return area;
    }

}
