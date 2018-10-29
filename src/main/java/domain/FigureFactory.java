package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {

    private static Map<FigureType, FigureCreator> figures = new HashMap<>();

    static {
        figures.put(FigureType.LINE, points -> new Line(points));
        figures.put(FigureType.TRIANGLE, points -> new Triangle(points));
        figures.put(FigureType.RECTANGLE, points -> new Rectangle(points));
    }

    public static Figure decideFigure(List<Point> points) {
        FigureType type = FigureType.getType(points.size());
        return figures.get(type).create(points);
    }
}
