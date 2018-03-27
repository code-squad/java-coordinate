package domain;

public class Shape {
    protected int lineCount;

    public Boolean hasLineCount(int lineCount) {
        if (this.lineCount == lineCount) {
            return true;
        }
        return false;
    }
}
