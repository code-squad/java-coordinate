package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    Triangle triangle;
    List<Line> lines;
    Line lA;
    Line lB;
    Line lC;

    @Before
    public void setup() throws Exception{
        // (10,10)-(14,15)-(20,8)
        Point pA = new Point(10, 10);
        Point pB = new Point(14, 15);
        Point pC = new Point(20, 8);

        List<Point> points = new ArrayList<>();
        points.add(pA);
        points.add(pB);
        points.add(pC);

        lA = new Line(pA, pB);
        lB = new Line(pB, pC);
        lC = new Line(pC, pA);

        LineList lineList = new LineList(points);
        triangle = new Triangle(lineList);
    }

    @Test
    public void getArea() {
        double a = lA.getDistance();
        double b = lB.getDistance();
        double c = lC.getDistance();

        double s = (a + b + c) / 2;
        Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        assertThat(triangle.getArea(),is(area));
    }
}
