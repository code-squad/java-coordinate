package domain;

import java.util.List;

public class Line extends Figure {

    public Line(List<Point> points) {
        super(points);
    }

    private double getDistance() {
        if(checkSamePoint())
            return findIdx(0).getDistance(findIdx(1));
        return 0;
    }

    private Boolean checkSamePoint() {
        if (findIdx(0).equals(findIdx(1)))
            return Boolean.FALSE;
        return Boolean.TRUE;
    }

    @Override
    public double calc() {
        return getDistance();
    }

}
