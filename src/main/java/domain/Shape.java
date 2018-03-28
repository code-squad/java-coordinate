package domain;

abstract public class Shape {
    private int lineCount;

    protected Shape(ShapeType shapeType) {
        this.lineCount = shapeType.getLineCount();
    }

    abstract Double getArea();

    public Boolean hasLineCount(int lineCount) {
        if (this.lineCount == lineCount) {
            return true;
        }
        return false;
    }
}