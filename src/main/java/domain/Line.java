package domain;

import util.PointException;
import java.util.*;

public class Line extends Figure {

    public Line(List<Point> points) throws PointException {
        super(points);
        if(!isComputable()) {
            throw new PointException("동일한 위치에 존재하는 점입니다.");
        }
    }

    @Override
    public double area() throws PointException {
        return getLineLength(getPoint(0), getPoint(1));
    }

    @Override
    public boolean isComputable() {
        return getPoint(0) != getPoint(1);
    }
}
