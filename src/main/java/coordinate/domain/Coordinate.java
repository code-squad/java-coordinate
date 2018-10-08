package coordinate.domain;

import coordinate.utils.CoordinateString;

import java.util.ArrayList;

public class Coordinate {
    private static final int MAXiMUM_NUM = 24;
    private ArrayList<CoordinateString> coordinatesAxis;
    private ArrayList<CoordinateLine> coordinatePlane;
    public Coordinate() {
        this.coordinatesAxis = makeCoordinateAxis();
        this.coordinatePlane = makeCoordinatePlane();
    }

    private ArrayList<CoordinateLine> makeCoordinatePlane() {
        ArrayList<CoordinateLine> field = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            field.add(new CoordinateLine());
        }
        return field;
    }

    private ArrayList<CoordinateString> makeCoordinateAxis() {
        ArrayList<CoordinateString> numCoordinate = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            numCoordinate.add(new CoordinateString(i));
        }
        return numCoordinate;
    }

    public ArrayList<CoordinateString> getCoordinatesAxis() {
        return coordinatesAxis;
    }

    public ArrayList<CoordinateLine> getCoordinatePlane() {
        return coordinatePlane;
    }
}
