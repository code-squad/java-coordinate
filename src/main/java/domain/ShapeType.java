package domain;

public enum ShapeType {
    LINE(1, 2), TRIANGLE(3, 3), RECTANGLE(4, 4);

    private int lineCount;
    private int pointCount;

    ShapeType(int lineCount, int pointCount) {
        this.lineCount = lineCount;
        this.pointCount = pointCount;
    }

    // matchCount pobi's advice
    public Boolean matchCount(int pointCount) {
        return this.pointCount == pointCount;
    }

    public Boolean isLine(int pointCount) {
        return LINE.matchCount(pointCount);
    }

    public Boolean isTriangle(int pointCount) {
        return TRIANGLE.matchCount(pointCount);
    }

    public Boolean isRectangle(int pointCount) {
        return RECTANGLE.matchCount(pointCount);
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getPointCount() {
        return pointCount;
    }
}
