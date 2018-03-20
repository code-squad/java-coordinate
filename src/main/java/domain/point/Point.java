package domain.point;

import java.util.Objects;

public class Point {
    public static final int X_POSITION_LIMIT = 24;
    public static final int Y_POSITION_LIMIT = 24;
    private int xPosition;
    private int yPosition;

    Point(int xPosition, int yPosition) {
        if (!isValidXPosition(xPosition)) {
            throw new IllegalArgumentException("X 포지션 값 최대 " + X_POSITION_LIMIT + "까지 입니다.");
        }

        if (!isValidYPosition(yPosition)) {
            throw new IllegalArgumentException("Y 포지션 값 최대 " + Y_POSITION_LIMIT + "까지 입니다.");
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    private static boolean isValidXPosition(int xPosition) {
        return (xPosition >= 0 && xPosition <= X_POSITION_LIMIT);
    }

    private static boolean isValidYPosition(int yPosition) {
        return (yPosition >= 0 && yPosition <= Y_POSITION_LIMIT);
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return xPosition == point.xPosition && yPosition == point.yPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPosition, yPosition);
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}

