package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    public static final int RANGE = 24;
    public static final int DOMAIN = 24;
    private final List<Coordinate> coordinates;

    public CoordinateCalculator(Shape shape) {
        this.coordinates = initCoordinates(shape);
    }

    private static List<Coordinate> initCoordinates(Shape shape) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int y = 0; y <= RANGE; y++) {
            initXY(coordinates, shape, y);
        }
        return coordinates;
    }

    private static List<Coordinate> initXY(List<Coordinate> coordinates, Shape shape, int y) {
        for (int x = DOMAIN; x >= 0; x--) {
            coordinates.add(createCoordinate(shape, x, y));
        }
        return coordinates;
    }

    private static Coordinate createCoordinate(Shape shape, int x, int y) {
        boolean match = false;
        if (shape instanceof Line) {
            Line line = (Line) shape;
            match = line.isMatch(x, y);
        }
        if (shape instanceof Square) {
            Square square = (Square) shape;
            match = square.isMatch(x, y);
        }
        if (match) {
            return Coordinate.ofPoint(x, y);
        }
        return Coordinate.ofNoPoint(x, y);
    }

    public String buildCalc() {
        return Builder.startBuild(coordinates);
    }
}