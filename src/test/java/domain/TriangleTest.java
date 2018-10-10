package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calc() {
        List<Point> points = new ArrayList<>();

        points.add(Point.init(1,1));
        points.add(Point.init(10,1));
        points.add((Point.init(1,10)));

        Figure t = Figure.init(points);
        assertEquals(t.area(), 40.5, 0.1);
    }

}