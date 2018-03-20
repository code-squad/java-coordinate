package view.coordinate;

import domain.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    private List<CoordinateLine> coordinateLines = new ArrayList<>();

    public Coordinate() {
        int xPositionLimit = Point.X_POSITION_LIMIT;
        int yPositionLimit = Point.Y_POSITION_LIMIT;

        for (int yPos = 0; yPos <= yPositionLimit; yPos++) {
            coordinateLines.add(new CoordinateLine(xPositionLimit, yPos));
        }
    }

    public boolean isYAxisPosition(int xPosition, int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        return searchCoordinateLine.isYAxisPosition(xPosition);
    }

    public boolean isXAxisPosition(int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        return searchCoordinateLine.isXAxisPosition();
    }

    public void drawPosition(int xPosition, int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        searchCoordinateLine.drawPosition(xPosition);
    }

    public boolean isDrawPosition(int xPosition, int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        return searchCoordinateLine.isDrawPosition(xPosition);
    }
}
