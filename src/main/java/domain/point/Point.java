package domain.point;

public class Point {
    private static final int X_POSITION_LIMIT = 24;
    private static final int Y_POSITION_LIMIT = 24;
    private int xPosition;
    private int yPosition;

    Point(int xPosition, int yPosition) {
        if (!isValidXPosition(xPosition)) {
            throw new IllegalArgumentException("X 포지션 값 최대 " + X_POSITION_LIMIT + "까지 입니다.");
        }

        if(!isValidYPosition(yPosition)) {
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

    public int getXPositionLimit() {
        return X_POSITION_LIMIT;
    }

    public int getYPositionLimit() {
        return Y_POSITION_LIMIT;
    }
}

