package coordinate.domain;

import coordinate.dto.PointDTO;
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
        ArrayList<CoordinateLine> coordinatePlane = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            coordinatePlane.add(new CoordinateLine());
        }
        return coordinatePlane;
    }

    private ArrayList<CoordinateString> makeCoordinateAxis() {
        ArrayList<CoordinateString> numCoordinate = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            numCoordinate.add(new CoordinateString(i));
        }
        return numCoordinate;
    }

    public void drawPoint(ArrayList<PointDTO> points) {
        for (PointDTO point : points) {
            this.coordinatePlane.get(point.getYPointDTO()).toStar(point.getXPointDTO());
        }
    }



    public ArrayList<CoordinateString> getCoordinatesAxis() {
        return coordinatesAxis;
    }

    public ArrayList<CoordinateLine> getCoordinatePlane() {
        return coordinatePlane;
    }
}
