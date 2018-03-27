package domain;

public class Shape {
    private int lineCount;

    protected Shape (int lineCount) {
        this.lineCount = lineCount;
    }

    public Boolean hasLineCount(int lineCount) {
        if (this.lineCount == lineCount) {
            return true;
        }
        return false;
    }
}
