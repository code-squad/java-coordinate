package domain;

import util.PointException;
import java.util.*;

public class Line {
    private List<Point> points;

    public Line(String[] inputPoint) throws PointException {
        points = new ArrayList<>();
        initLine(inputPoint);


    }

    private void initLine(String[] inputPoint) throws PointException {
        for(String point : inputPoint) {
            points.add(PointFactory.create(point));
        }
    }

    public double getDistance() {
        return points.get(0).getDistance(points.get(1));
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }
}
