package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calc() {
        List<Point> points = new ArrayList<>();

        points.add(Point.init(1,1));
        points.add(Point.init(10,1));
        points.add(Point.init(10,10));
        points.add(Point.init(1,10));

        Figure r = Figure.init(points);

        assertEquals(r.calc(), 81.0, 0.1);
    }

}