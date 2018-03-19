package domain.coordinate;

import java.util.ArrayList;

public class CoordinateLine {
    private static final int X_POS_LIMIT = 24;
    private ArrayList<CoordinatePoint> coordinatePoints = new ArrayList<>();
    private int yPosition;

    CoordinateLine(int yPosition) {
        this.yPosition = yPosition;
        makePoints();
    }

    private void makePoints() {
        for (int xPos = 0; xPos <= X_POS_LIMIT; xPos++) {
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
        return X_POS_LIMIT >= xPosition;
    }

    public void drawPosition(int xPosition) {
        CoordinatePoint searchCoordinatePoint = coordinatePoints.get(xPosition);
        searchCoordinatePoint.drawPostion();
    }

    public boolean isDrawPosition(int xPosition) {
        CoordinatePoint searchCoordinatePoint = coordinatePoints.get(xPosition);
        return searchCoordinatePoint.isDrawPosition();
    }
}
