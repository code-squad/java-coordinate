package coordinate.domain;

import coordinate.view.Output;

public class Point {
    private static final int DOMAIN_RANGE = 24;
    private static final int COORDINATE_LENGTH = 2;
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private final int x;
    private final int y;

    Point(int[] xySet) {
        xySet = checkCoordinateValidity(xySet);
        this.x = xySet[X_INDEX];
        this.y = xySet[Y_INDEX];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean contains(int y) {
        return this.y == y;
    }

    static int[] checkCoordinateValidity(int[] xySet) throws IllegalArgumentException {
        if (!isValidCoordinate(xySet)) {
            Output.printMessage("좌표 포맷이 맞지 않습니다.");
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    private static boolean isValidCoordinate(int[] xySet) {
        if (xySet.length != COORDINATE_LENGTH) {
            return false;
        }
        if (isOutOfDomainRange(xySet[X_INDEX]) || isOutOfDomainRange(xySet[Y_INDEX])) {
            return false;
        }
        return true;
    }

    private static boolean isOutOfDomainRange(Integer number) {
        return number > DOMAIN_RANGE;
    }

    @Override
    public boolean equals(Object o) {
        Point point = (Point) o;
        return point.x == this.x && point.y == this.y;
    }
}