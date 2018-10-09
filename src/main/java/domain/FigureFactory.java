package domain;

import util.PointException;

import java.util.*;

public class FigureFactory {
    public static Figure create(String[] inputPoint) throws PointException {
        if(inputPoint.length == 2) {
            return new Line(init(inputPoint));
        }
        if(inputPoint.length == 4) {
            return new Rectangle(init(inputPoint));
        }
        throw new PointException("직선도 사각형도 아닌 형태로 입력하셨습니다.");
    }

    private static List<Point> init(String[] inputPoint) throws PointException {
        List<Point> points = new ArrayList<>();
        for(String point : inputPoint) {
            points.add(PointFactory.create(point));
        }
        return points;
    }
}
