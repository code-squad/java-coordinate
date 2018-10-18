package coordinate.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    private static Map<Integer, FigureCreator> whatFigure = new HashMap<>();

    static {
        whatFigure.put(2, new LineFactory());
        whatFigure.put(3, new TriangleFactory());
        whatFigure.put(4, new RectangleFactory());
    }

    public static AbstractFigure create(List<Point> points) {
        if (!whatFigure.containsKey(points.size())) {
            throw new IllegalArgumentException("도형이 아닙니다.");
        }
        return whatFigure.get(points.size()).create(points);
    }
}
