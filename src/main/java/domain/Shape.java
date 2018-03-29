package domain;

public class Shape implements Area, Distance {
    private int lineCount;
    private int pointCount;

    protected Shape(ShapeType shapeType) {
        this.lineCount = shapeType.getLineCount();
        this.pointCount = shapeType.getPointCount();
    }

    public Boolean hasLineCount(int lineCount) {
        if (this.lineCount == lineCount) {
            return true;
        }
        return false;
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public Double getDistance() {
        return null;
    }
}