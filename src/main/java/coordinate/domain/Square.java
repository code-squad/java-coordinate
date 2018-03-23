package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int LARGEST_INDEX = 0;
    private static final int SMALLEST_INDEX = 1;
    private final int base;
    private final int height;

    private Square(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public static Square newSquareInstance(List<Point> points) throws IllegalArgumentException {
        if (isSquare(points)) {
            int base = calculateBase(points);
            int height = calculateHeight(points);
            return new Square(base, height);
        }
        throw new IllegalArgumentException();
    }

    static int calculateBase(List<Point> points) {
        Integer[] xSet = returnXSet(points);
        return Math.abs(xSet[LARGEST_INDEX] - xSet[SMALLEST_INDEX]);
    }

    static int calculateHeight(List<Point> points) {
        Integer[] ySet = returnYSet(points);
        return Math.abs(ySet[LARGEST_INDEX] - ySet[SMALLEST_INDEX]);
    }


    public static boolean isSquare(List<Point> points) {
        return returnXSet(points).length == returnYSet(points).length && points.size() == 4;
    }
}