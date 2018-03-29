package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    Rectangle rectangle;
    Double area;

    @Before
    public void setup() throws Exception {
        // (10,10)-(22,10)-(22,18)-(10,18)
        // width: (10, 10)-(22, 10) height: (10,10)-(10,18)
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(10, 18), new Point(22, 10), new Point(22, 18));

        Line lineWidth = new Line(points.get(0), points.get(2));
        Line lineHeight = new Line(points.get(0), points.get(1));
        area = lineHeight.getDistance() * lineWidth.getDistance();

        LineList lineList = new LineList(points);
        rectangle = new Rectangle(lineList);
    }

    @Test
    public void getArea() {
        assertThat(rectangle.getArea(), is(area));
    }
}
