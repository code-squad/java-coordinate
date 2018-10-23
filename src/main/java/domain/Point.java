package domain;

public class Point {
    private static final int LINE_SIZE = 51;
    private static final int MAX_POINT_VALUE = 24;
    private static final int UNIT_DIGIT_RANGE = 10;
    private static final int TWO = 2;
    private static final int ONE = 1;

    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        if (xPos > MAX_POINT_VALUE || xPos < 0) throw new IllegalArgumentException();
        this.xPos = xPos;
        if (yPos > MAX_POINT_VALUE || yPos < 0) throw new IllegalArgumentException();
        this.yPos = yPos;
    }

    int subtractXPoint(Point p) {
        return xPos - p.xPos;
    }

    int subtractYPoint(Point p) {
        return yPos - p.yPos;
    }

    public int findPointPosition() {
        int index = (MAX_POINT_VALUE - yPos) * LINE_SIZE + (xPos * TWO) + ONE;
        if (xPos < UNIT_DIGIT_RANGE) index += 1;
        return index;
    }

    double calculateLength(Point p) {
        return Math.sqrt(Math.pow(this.subtractXPoint(p), 2) + Math.pow(this.subtractYPoint(p), 2));
    }
}