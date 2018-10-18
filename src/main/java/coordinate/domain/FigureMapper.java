package coordinate.domain;

import coordinate.util.InputException;

import java.util.HashMap;
import java.util.List;

public class FigureMapper {
    public static final int CRITERIA_FOR_LINE = 2;
    public static final int CRITERIA_FOR_TRIANGLE = 3;
    public static final int CRITERIA_FOR_RECTANGLE = 4;

    public static final int MAX = 4;
    public static final int MIN = 2;

    HashMap<Integer, FigureCreator> map = new HashMap<>();

    public FigureMapper() {
        map.put(CRITERIA_FOR_LINE, new LineFactory());
        map.put(CRITERIA_FOR_TRIANGLE, new TriangleFactory());
        map.put(CRITERIA_FOR_RECTANGLE, new RectangleFactory());
    }

    public FigureAbstract getFigure(List<Point> points) throws InputException {
        if(points.size() < MIN || points.size() > MAX) {
            throw new InputException("2 ~ 4개의 점만 찍어주세요");
        }
        return map.get(points.size()).create(points);
    }
}
