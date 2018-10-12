package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureMapper {
    private static final int MIN = 2;
    private static final int MAX = 4;

    private Map<Integer, FigureFactory> figureFactoryMap;

    public FigureMapper() {
        figureFactoryMap = new HashMap<>();
        this.figureFactoryMap.put(2, new LineFactory());
        this.figureFactoryMap.put(3, new TriangleFactory());
        this.figureFactoryMap.put(4, new RectangleFactory());
    }

    public Figure getFigure(List<Point> points){
        if(points.size() < MIN || points.size() > MAX) return null;
        return this.figureFactoryMap.get(points.size()).create(points);
    }
}
