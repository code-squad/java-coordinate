package coordinate.domain;

import java.util.List;

public abstract class AbstractFigure implements Figure {
    private List<Point> points;

    public AbstractFigure(List<Point> points) {
        this.points = points;
    }

//    protected List<Point> getPoints(){
//        return Collections.unmodifiableList(points); // 읽기 전용 (수정 안됨)
//    }

    protected Point getPoint(int index) { // 보안상 안전
        return points.get(index);
    }

    protected int getSize() {
        return points.size();
    }

    protected double getDist(int a, int b) {
        return getPoint(a).distance(getPoint(b));
    }


}

