package domain;

public class Point {
    static final int LINE_SIZE = 51;
    static final int MAX_POINT_VALUE = 24;
    static final int UNIT_DIGIT_RANGE = 10;
    static final int TWO = 2;
    static final int ONE = 1;

    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        if (xPos > MAX_POINT_VALUE || xPos < 0) throw new IllegalArgumentException();
        this.xPos = xPos;
        if (yPos > MAX_POINT_VALUE || yPos < 0) throw new IllegalArgumentException();
        this.yPos = yPos;
    }

    public int subtractXPoint(Point p) {
        return xPos - p.xPos;
    }

    public int subtractYPoint(Point p) {
        return yPos - p.yPos;
    }

    public int findPointInedx() {
        int index = (MAX_POINT_VALUE - yPos) * LINE_SIZE + (xPos * TWO) + ONE;
        if (xPos < UNIT_DIGIT_RANGE) index += 1;
        return index;
    }
}