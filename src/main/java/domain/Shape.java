package domain;

public class Shape {
    private int lineCount;
    private int pointCount;
    private Double area;

    protected Shape(ShapeType shapeType) {
        this.lineCount = shapeType.getLineCount();
        this.pointCount = shapeType.getPointCount();
    }

    public Boolean hasLineCount(int lineCount) {
        return this.lineCount == lineCount;
    }
}