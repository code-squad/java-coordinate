package domain;

import java.util.ArrayList;

public class Line {
    private static final int X_POS_LIMIT = 24;
    private ArrayList<Point> points = new ArrayList<>();
    private int yPosition;

    Line(int yPosition) {
        this.yPosition = yPosition;
        makePoints();
    }

    private void makePoints() {
        for (int xPos = 0; xPos <= X_POS_LIMIT; xPos++) {
            points.add(new Point(xPos));
        }
    }

    public boolean isYAxisPosition(int xPosition) {
        Point searchPoint = points.get(xPosition);
        return searchPoint.isMatchPosition(0);
    }

    public boolean isXAxisPosition() {
        return this.yPosition == 0;
    }

    public boolean isValidXPosition(int xPosition) {
        return X_POS_LIMIT >= xPosition;
    }
}
