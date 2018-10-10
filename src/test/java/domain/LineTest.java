package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void calc() {
        List<Point> points = new ArrayList<>();

        points.add(Point.init(1, 1));
        points.add(Point.init(10, 10));

        Figure l = Figure.init(points);
        assertEquals(l.area(), 12.7, 0.1);
    }

}