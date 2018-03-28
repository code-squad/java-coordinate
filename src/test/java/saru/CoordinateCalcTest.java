package saru;

import org.junit.Before;
import saru.domain.*;

import java.util.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class CoordinateCalcTest {
    private static final int MAX_VALUE = 24;
    private Set<Point> points;

    @Before
    public void init() {
        points = new HashSet<>();
    }

    @Test
    public void makePoint() {
        Point point = new Point(1, 24, true);
        assertThat(point.getX(), is(1.0));
        assertThat(point.getY(), is(24.0));
    }

    @Test
    public void pointConstructorOverloadingExistFalse() {
        Point point = new Point(1, 24);
        assertFalse(point.isExist());
    }

    @Test
    public void drawPoint() {
        Point point1 = new Point(4, 4);

        points.add(point1);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        coordinateCalc.drawPoint(points.iterator().next());

        RowLine foundRowLines = coordinateCalc.getRowLines().get(MAX_VALUE - 4);
        Point foundPoint = foundRowLines.getPoints().get(4);
        assertThat(foundPoint.isExist(), is(true));
    }

    @Test
    public void calcLine() {
        addSetNormalValues();

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        double result = coordinateCalc.calcProc();
        assertEquals(1.414, result, 0.001);
    }

    @Test
    public void checkShapeType() {
        addSetNormalValues();

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        Set<Point> userInput = coordinateCalc.getUserInput();
        ShapeType shapeType = coordinateCalc.checkShapeType(userInput);

        assertEquals(ShapeType.LINE, shapeType);
    }

    private void addSetNormalValues() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        points.add(point1);
        points.add(point2);
    }
}