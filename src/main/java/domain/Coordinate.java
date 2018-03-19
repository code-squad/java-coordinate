package domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    private static Coordinate coordinate = new Coordinate();
    private static final int Y_POS_LIMIT = 24;
    private List<Line> lines = new ArrayList<>();

    private Coordinate() {
        makeLines();
    }

    private void makeLines() {
        for (int yPos = 0; yPos <= Y_POS_LIMIT; yPos++) {
            lines.add(new Line(yPos));
        }
    }

    public static Coordinate of() {
        return coordinate;
    }

    public boolean isYAxisPosition(int xPosition, int yPosition) {
        Line searchLine = lines.get(yPosition);
        return searchLine.isYAxisPosition(xPosition);
    }

    public boolean isXAxisPosition(int yPosition) {
        Line searchLine = lines.get(yPosition);
        return searchLine.isXAxisPosition();
    }

    public boolean isValidYPosition(int yPosition) {
        int limitYPos = lines.size() - 1;
        return yPosition >= 0 && yPosition <= limitYPos;
    }

    public boolean isValidXPosition(int xPosition) {
        Line firstLine = lines.get(0);
        return firstLine.isValidXPosition(xPosition);
    }

    public int getYPositionLimit() {
        return Y_POS_LIMIT;
    }
}
