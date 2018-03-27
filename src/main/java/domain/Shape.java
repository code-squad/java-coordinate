package domain;

public class Shape {
    private int lineCount;

    protected Shape(ShapeType shapeType) {
        this.lineCount = shapeType.getLineCount();
    }

    public Boolean hasLineCount(int lineCount) {
        if (this.lineCount == lineCount) {
            return true;
        }
        return false;
    }
}