package coordinate.domain;

import coordinate.domain.factory.LineFactory;
import coordinate.domain.factory.RectangleFactory;
import coordinate.domain.factory.TriangleFactory;

import java.util.HashMap;

public class MapFactory {
    public static HashMap<Integer, FigureCreator> map;

    private MapFactory() {
        map = new HashMap<>();
        map.put(2, new LineFactory());
        map.put(3, new TriangleFactory());
        map.put(4, new RectangleFactory());
    }

    public static void makeFactory(){
        new MapFactory();
    }
}
