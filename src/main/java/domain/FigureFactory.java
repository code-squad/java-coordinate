package domain;

import util.PointException;

import java.lang.reflect.Constructor;
import java.util.*;

public class FigureFactory {
    private static Map<Integer, String> constructorMap = new HashMap<>();
    static {
        constructorMap.put(2, "domain.Line");
        constructorMap.put(3, "domain.Triangle");
        constructorMap.put(4, "domain.Rectangle");
    }

    public static Figure create(String[] inputPoint) throws PointException {
        Constructor constructor = null;
        try {
            constructor = Class.forName(constructorMap.get(inputPoint.length)).getConstructor(List.class);
            return (Figure)constructor.newInstance(init(inputPoint));
        } catch (Exception e) {

        }
        throw new PointException("직선, 삼각형, 직사각형이 아닌 형태로 입력하셨습니다.");
    }

    private static List<Point> init(String[] inputPoint) throws PointException {
        List<Point> points = new ArrayList<>();
        for(String dot : inputPoint) {
            Point point = PointFactory.create(dot);
            /* 중복된 점이 있는지 확인 */
            addPoint(points, point);
        }
        return points;
    }

    public static boolean isDuplication(List<Point> points, Point point) {
        return points.contains(point);
    }

    private static void addPoint(List<Point> points, Point point) throws PointException {
        if(isDuplication(points, point)) {
            throw new PointException("중복된 점을 입력하셨습니다.");
        }
        points.add(point);
    }

}
