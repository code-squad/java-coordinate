package domain.coordinate;

import java.util.ArrayList;

public class CoordinateLine {
    private ArrayList<CoordinatePoint> coordinatePoints = new ArrayList<>();
    private int yPosition;

    CoordinateLine(int xPositionLimit, int yPosition) {
        this.yPosition = yPosition;
        for (int xPos = 0; xPos <= xPositionLimit; xPos++) {
            coordinatePoints.add(new CoordinatePoint(xPos));
        }
    }

    public boolean isYAxisPosition(int xPosition) {
        CoordinatePoint searchCoordinatePoint = coordinatePoints.get(xPosition);
        return searchCoordinatePoint.isMatchPosition(0);
    }

    public boolean isXAxisPosition() {
        return this.yPosition == 0;
    }

    public boolean isValidXPosition(int xPosition) {
        int xPositionLimit = coordinatePoints.size() - 1;
        return xPositionLimit == xPosition;
    }

    public void drawPosition(int xPosition) {
        CoordinatePoint searchCoordinatePoint = coordinatePoints.get(xPosition);
        searchCoordinatePoint.drawPosition();
    }

    public boolean isDrawPosition(int xPosition) {
        CoordinatePoint searchCoordinatePoint = coordinatePoints.get(xPosition);
        return searchCoordinatePoint.isDrawPosition();
    }
}
