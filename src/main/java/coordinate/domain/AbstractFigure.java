package coordinate.domain;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractFigure implements Figure{
    protected List<Point> points;

    AbstractFigure(List<Point> points) {
        this.points = points;
    }

    private Boolean isSamePoint() {
        Set<Point> isTrue = new HashSet<>(points);
        return isTrue.size() == this.points.size();
    }
    protected void figureException() {
        if (this.points.size() < size()) {
            throw new IllegalArgumentException(name() + "이 아닙니다. 다시 입력 해주세요");
        }
        if (!isSamePoint()) {
            throw new IllegalArgumentException("같은 점을 입력했습니다. " + name() + "이 아닙니다. 다시 입력해 주세요");
        }
        if (!isFigure()) {
            throw new IllegalArgumentException(name() + "이 아닙니다. 다시 입력 해주세요");
        }
    }

    protected boolean isFigure() {
        return true;
    }

    protected abstract int size();
}
