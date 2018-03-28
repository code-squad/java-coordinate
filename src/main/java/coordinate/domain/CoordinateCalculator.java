package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    public static final int RANGE = 24;
    public static final int DOMAIN = 24;
    private final List<Coordinate> coordinates;

    public CoordinateCalculator(Calculable figure) {
        this.coordinates = initCoordinates(figure);
    }

    private static List<Coordinate> initCoordinates(Calculable figure) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int y = 0; y <= RANGE; y++) {
            initXY(coordinates, figure, y);
        }
        return coordinates;
    }

    private static List<Coordinate> initXY(List<Coordinate> coordinates, Calculable figure, int y) {
        for (int x = DOMAIN; x >= 0; x--) {
            coordinates.add(createCoordinate(figure, x, y));
        }
        return coordinates;
    }

    private static Coordinate createCoordinate(Calculable figure, int x, int y) {
        if (figure.isMatch(x, y)) {
            return Coordinate.ofPoint(x, y);
        }
        return Coordinate.ofNoPoint(x, y);
    }

    public String buildCalc() {
        return Builder.startBuild(coordinates);
    }
}