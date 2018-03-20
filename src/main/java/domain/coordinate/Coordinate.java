package domain.coordinate;

import domain.point.Points;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    private List<CoordinateLine> coordinateLines = new ArrayList<>();

    public Coordinate(Points pointRepo) {
        int xPositionLimit = pointRepo.getXPositionLimit();
        int yPositionLimit = pointRepo.getYPositionLimit();

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

    public boolean isValidYPosition(int yPosition) {
        int limitYPos = coordinateLines.size() - 1;
        return yPosition >= 0 && yPosition <= limitYPos;
    }

    public boolean isValidXPosition(int xPosition) {
        CoordinateLine firstCoordinateLine = coordinateLines.get(0);
        return firstCoordinateLine.isValidXPosition(xPosition);
    }

    public int getYPositionLimit() {
        return coordinateLines.size() - 1;
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
