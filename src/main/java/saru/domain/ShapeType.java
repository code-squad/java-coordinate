package saru.domain;

public enum ShapeType {
    POINT(1),
    LINE(2),
    TRIANGLE(3),
    SQUARE(4);

    private int pointNum;

    ShapeType(int pointNum) {
        this.pointNum = pointNum;
    }

    public int getPointNum() {
        return pointNum;
    }
}