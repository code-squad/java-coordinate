package domain;

public abstract class Figure implements FigureAPI {

    private Points points;

    Figure(Points points) {
        this.points = points;
    }

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    double calculateLine(int a, int b) {
        return points.calculateLineBwPoints(a, b);
    }
}
