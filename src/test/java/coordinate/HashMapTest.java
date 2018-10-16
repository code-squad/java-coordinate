package coordinate;

import coordinate.domain.AbstractFigure;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;
import coordinate.domain.Triangle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {
    @Test
    public void 해시맵사용() {
        List<Point> points = new ArrayList<>();

        points.add(Point.of(1,2));
        points.add(Point.of(2,2));
        points.add(Point.of(1,2));

        HashMap<Integer, AbstractFigure> h = new HashMap<Integer, AbstractFigure>();
        h.put(3, new Triangle(points));
        h.put(4, new Rectangle(points));


        System.out.println(h.get(points.size()));
    }
}
