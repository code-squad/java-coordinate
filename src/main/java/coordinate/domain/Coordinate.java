package coordinate.domain;

import coordinate.dto.PointDTO;
import coordinate.utils.CoordinateString;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    private static final int MAXiMUM_NUM = 24;
    private List<CoordinateString> coordinatesAxis;
    private List<CoordinateYLine> coordinatePlane;

    public Coordinate() {
        this.coordinatesAxis = makeCoordinateAxis();
        this.coordinatePlane = makeCoordinatePlane();
    }

    private ArrayList<CoordinateYLine> makeCoordinatePlane() {
        ArrayList<CoordinateYLine> coordinatePlane = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            coordinatePlane.add(new CoordinateYLine());
        }
        return coordinatePlane;
    }

    private List<CoordinateString> makeCoordinateAxis() {
        List<CoordinateString> numCoordinate = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            numCoordinate.add(new CoordinateString(i));
        }
        return numCoordinate;
    }

    public void drawPoint(List<PointDTO> points) {
        for (PointDTO point : points) {
            this.coordinatePlane.get(point.getYPointDTO()).toMarking(point.getXPointDTO());
        }
    }

    public List<CoordinateString> getCoordinatesAxis() {

        return coordinatesAxis;
    }

    public List<CoordinateYLine> getCoordinatePlane() {
        return coordinatePlane;
    }
}
