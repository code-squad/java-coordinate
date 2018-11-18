package coordinate.domain.Figure;

import coordinate.domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    private FigureFactory() {}

    public static Figure getInstance(List<Point> coordinate) {
        Map<Type, FigureCreator> map = new HashMap<>();
        map.put(Type.LINE, coordinates -> Line.ofCoordinate(coordinates));
        map.put(Type.TRIANGLE, coordinates -> Triangle.ofCoordinate(coordinates));
        map.put(Type.RECTANGLE, coordinates -> Rectangle.ofCoordinate(coordinates));

        return map.get(Type.valueOf(coordinate.size())).create(coordinate);
    }
}
