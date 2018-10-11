package coordinate.controller;

import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class LineFactory {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;

    public static boolean isPossibleLine(int size){
        return size == TWO;
    }

    public static Line generateLine(List<Point> points){
        return new Line(points.get(ZERO), points.get(ONE));
    }
}
