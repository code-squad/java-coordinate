package domain;

import util.PointException;
import java.util.*;

public class Line extends Figure {
    private List<Point> points;

    public Line(List<Point> points) throws PointException {
        this.points = points;
        if(!isComputable()) {
            throw new PointException("동일한 위치에 존재하는 점입니다.");
        }
        Collections.sort(points);
    }

    @Override
    public double evaluate() {
        return points.get(0).getDistance(points.get(1));
    }

    @Override
    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    @Override
    public boolean isComputable() {
        return points.get(0) != points.get(1);
    }
}
