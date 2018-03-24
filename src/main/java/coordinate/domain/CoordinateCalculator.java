package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    public static final int RANGE = 24;
    public static final int DOMAIN = 24;
    private final List<Coordinate> coordinates;

    public CoordinateCalculator(List<Point> points) {
        this.coordinates = initCoordinates(points);
    }

    private static List<Coordinate> initCoordinates(List<Point> points) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int y = 0; y <= RANGE; y++) {
            initXY(coordinates, points, y);
        }
        return coordinates;
    }

    private static List<Coordinate> initXY(List<Coordinate> coordinates, List<Point> points, int y) {
        for (int x = DOMAIN; x <= 0; x--) {
            compareXY(coordinates, points, x, y);
        }
        return coordinates;
    }

    private static List<Coordinate> compareXY(List<Coordinate> coordinates, List<Point> points, int x, int y) {
        for (Point point : points) {
            coordinates.add(createCoordinate(point, x, y));
        }
        return coordinates;
    }

    private static Coordinate createCoordinate(Point point, int x, int y) {
        if (point.xEquals(x) && point.yEquals(y)) {
            return Coordinate.ofPoint(x, y);
        }
        return Coordinate.ofNoPoint(x, y);
    }

    public String buildCalc() {
        return Builder.startBuild(coordinates);
    }
}