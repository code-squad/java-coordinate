package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    Triangle triangle;
    Double area;

    @Before
    public void setup() throws Exception {
        // (10,10)-(14,15)-(20,8)
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(20, 8));
        Line a = new Line(points.get(0), points.get(1));
        Line b = new Line(points.get(1), points.get(2));
        Line c = new Line(points.get(2), points.get(0));

        area = calArea(a.getDistance(), b.getDistance(), c.getDistance());

        LineList lineList = new LineList(points);
        triangle = new Triangle(lineList);
    }

    @Test
    public void getArea() {
        assertThat(triangle.getArea(), is(area));
    }

    private double calArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
