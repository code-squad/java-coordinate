package domain;

import util.PointException;
import java.util.*;

public class Line extends Figure {

    public Line(List<Point> points) throws PointException {
        this.points = points;
        Collections.sort(points);

        if(!isComputable()) {
            throw new PointException("동일한 위치에 존재하는 점입니다.");
        }
    }

    @Override
    public double evaluate() throws PointException {
        return getLineLength(points.get(0), points.get(1));
    }

    @Override
    public boolean isComputable() {
        return points.get(0) != points.get(1);
    }
}
