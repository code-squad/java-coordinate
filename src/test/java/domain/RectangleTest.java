package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    Rectangle rectangle;
    List<Line> lines;
    Line lineWidth;
    Line lineHeight;
    Line lineCross;

    @Before
    public void setup() throws Exception {
        // (10,10)-(22,10)-(22,18)-(10,18)
        // width: a(10, 10)-c(22, 10) height: a(10,10)-b(10,18)
        Point a = new Point(10, 10);
        Point b = new Point(10, 18);
        Point c = new Point(22, 10);
        Point d = new Point(22, 18);

        List<Point> points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);

        lineWidth = new Line(a,c);
        lineHeight = new Line(a,b);
        lineCross = new Line(a, d);

        LineList lineList = new LineList(points);
        rectangle = new Rectangle(lineList);
    }

    @Test
    public void getArea() {
        Double area = lineHeight.getDistance() * lineWidth.getDistance();
        assertThat(rectangle.getArea(),is(area));
    }
}
