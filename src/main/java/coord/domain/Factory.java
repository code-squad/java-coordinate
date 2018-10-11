package coord.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factory {
    private static Map<Integer, FigureCreator> map;
    static{
        map = new HashMap<>();
        map.put(1, Point::new);
        map.put(2, Line::new);
        map.put(3, Triangle::new);
        map.put(4, Rectangle::new);
    }

    public static Figure of(List<Point> points) {
        FigureCreator creator = map.get(points.size());
        return creator.create(points);
    }
}
