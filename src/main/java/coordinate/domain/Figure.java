package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Figure {
    protected  String name;
    protected ArrayList<Point> points;
    protected int size;
    protected double result;

    protected Boolean isSamePoint() {
        HashSet<Point> isTrue = new HashSet<>(points);
        return isTrue.size() == this.points.size();
    }

    protected abstract void calculate();

    public String area() {
        if (this.points.size() < size) {
            return this.name + "이 아닙니다.";
        }
        if (!isSamePoint()) {
            throw new IllegalArgumentException("같은 점을 입력했습니다. " + this.name + "이 아닙니다. 다시 입력해 주세요");
        }
        if (!isFigure()) {
            throw new IllegalArgumentException(this.name + "이 아닙니다. 다시 입력 해주세요");
        }
        calculate();
        return this.name + "의 면적은 " + result + " 입니다.";
    }

    protected boolean isFigure() {
        return true;
    }
}
