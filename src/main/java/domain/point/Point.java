package domain.point;

import java.util.Objects;

public class Point {
    public static final int X_POSITION_LIMIT = 24;
    public static final int Y_POSITION_LIMIT = 24;
    private int xPosition;
    private int yPosition;

    public Point(int xPosition, int yPosition) {
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

    public double calcDistance(Point otherPoint) {
        double xDiffSquare = calcDiffSquare(this.xPosition, otherPoint.getXPosition());
        double yDiffSquare = calcDiffSquare(this.yPosition, otherPoint.getYPosition());
        return calcSquareRoot(xDiffSquare + yDiffSquare);
    }

    private double calcSquareRoot(double num) {
        return Math.sqrt(num);
    }

    private double calcDiffSquare(int aSidePosition, int bSidePosition) {
        int positionDiff = calcDiffPosition(aSidePosition, bSidePosition);
        return Math.pow(positionDiff, 2);
    }

    private static int calcDiffPosition(int aSidePosition, int bSidePosition) {
        return aSidePosition - bSidePosition;
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

