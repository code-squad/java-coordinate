package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class AbstractFigure implements Figure{
    protected ArrayList<Point> points;

    public AbstractFigure(ArrayList<Point> points) {
        this.points = points;
    }

    private Boolean isSamePoint() {
        HashSet<Point> isTrue = new HashSet<>(points);
        return isTrue.size() == this.points.size();
    }

    public String result() {
        if (this.points.size() < size()) {
            return name() + "이 아닙니다.";
        }
        if (!isSamePoint()) {
            throw new IllegalArgumentException("같은 점을 입력했습니다. " + name() + "이 아닙니다. 다시 입력해 주세요");
        }
        if (!isFigure()) {
            throw new IllegalArgumentException(name() + "이 아닙니다. 다시 입력 해주세요");
        }
        return name()+ "의 면적은 " + area() + " 입니다.";
    }

    protected boolean isFigure() {
        return true;
    }

    protected abstract String name();

    protected abstract int size();
}
