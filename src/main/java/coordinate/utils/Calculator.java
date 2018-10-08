package coordinate.utils;

import coordinate.domain.Point;

import java.util.ArrayList;

public class Calculator {

    public static double line(ArrayList<Point> points) {
        double x = points.get(0).getXPoint() - points.get(1).getXPoint();
        double y = points.get(0).getYPoint() - points.get(1).getYPoint();

        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
}
