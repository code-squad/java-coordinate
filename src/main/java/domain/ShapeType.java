package domain;

public enum ShapeType {
    LINE(1, 2), TRIANGLE(3, 3), RECTANGLE(4, 4);

    private int lineCount;
    private int pointCount;

    ShapeType(int lineCount, int pointCount) {
        this.lineCount = lineCount;
        this.pointCount = pointCount;
    }

    public Boolean isLine(int pointCount) {
        if (LINE.getPointCount() == pointCount) {
            return true;
        }
        return false;
    }

    public Boolean isTriangle(int pointCount) {
        if (TRIANGLE.getPointCount() == pointCount) {
            return true;
        }
        return false;
    }

    public Boolean isRectangle(int pointCount) {
        if (RECTANGLE.getPointCount() == pointCount) {
            return true;
        }
        return false;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getPointCount() {
        return pointCount;
    }
}
