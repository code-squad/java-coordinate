package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int LARGEST_INDEX = 0;
    private static final int SMALLEST_INDEX = 1;
    private final double base;
    private final double height;

    private Square(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public static Square newSquareInstance(List<Point> points) throws IllegalArgumentException {
        if (isSquare(points)) {
            Integer[] xSet = returnXSet(points);
            Integer[] ySet = returnYSet(points);
            double base = xSet[LARGEST_INDEX] - xSet[SMALLEST_INDEX];
            double height = ySet[LARGEST_INDEX] - ySet[SMALLEST_INDEX];

            return new Square(base, height);
        }
        throw new IllegalArgumentException();
    }

    public static boolean isSquare(List<Point> points) {
        return returnXSet(points).length == returnYSet(points).length && points.size() == 4;
    }
}