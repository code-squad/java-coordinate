package coordinate.controller;

import coordinate.CoordinateFactory;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class LineFactory {
    public static boolean isPossibleLine(int size){
        return size == CoordinateFactory.TWO;
    }

    public static Line generateLine(List<Point> points){
        return new Line(points.get(CoordinateFactory.ZERO), points.get(CoordinateFactory.ONE));
    }
}
