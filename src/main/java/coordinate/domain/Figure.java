package coordinate.domain;

import java.util.Collections;
import java.util.List;

public abstract class Figure {
    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public abstract String name();

    public abstract double area();

    protected List<Point> getPoints(){
        return Collections.unmodifiableList(points); // 읽기 전용 (수정 안됨)
    }

//    protected Point getPoint(int index){ // 보안상 안전
//        return points.get(index);
//    }
}

