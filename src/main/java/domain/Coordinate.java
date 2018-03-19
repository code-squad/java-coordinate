package domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    private static Coordinate coordinate = new Coordinate();
    private static final int Y_POS_LIMIT = 24;
    private List<CoordinateLine> coordinateLines = new ArrayList<>();

    private Coordinate() {
        makeLines();
    }

    private void makeLines() {
        for (int yPos = 0; yPos <= Y_POS_LIMIT; yPos++) {
            coordinateLines.add(new CoordinateLine(yPos));
        }
    }

    public static Coordinate of() {
        return coordinate;
    }

    public boolean isYAxisPosition(int xPosition, int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        return searchCoordinateLine.isYAxisPosition(xPosition);
    }

    public boolean isXAxisPosition(int yPosition) {
        CoordinateLine searchCoordinateLine = coordinateLines.get(yPosition);
        return searchCoordinateLine.isXAxisPosition();
    }

    public boolean isValidYPosition(int yPosition) {
        int limitYPos = coordinateLines.size() - 1;
        return yPosition >= 0 && yPosition <= limitYPos;
    }

    public boolean isValidXPosition(int xPosition) {
        CoordinateLine firstCoordinateLine = coordinateLines.get(0);
        return firstCoordinateLine.isValidXPosition(xPosition);
    }

    public int getYPositionLimit() {
        return Y_POS_LIMIT;
    }
}
