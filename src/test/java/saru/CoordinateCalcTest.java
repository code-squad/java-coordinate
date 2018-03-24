package saru;

import saru.domain.*;
import saru.view.*;

import java.util.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CoordinateCalcTest {
    private static final int MAX_VALUE = 24;

    @Test
    public void makePoint() {
        Point point = new Point(1, 24, true);
        assertThat(point.getX(), is(1.0));
        assertThat(point.getY(), is(24.0));
    }

    @Test
    public void drawPoint() {
        Point point1 = new Point(4, 4);

        List<Point> points = new ArrayList<>();
        points.add(point1);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        coordinateCalc.drawPoint(points.get(0));

        RowLine foundRowLines = coordinateCalc.getRowLines().get(MAX_VALUE - 4);
        Point foundPoint = foundRowLines.getPoints().get(4);
        assertThat(foundPoint.isExist(), is(true));
    }

    @Test
    public void calcLine() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);

        assertEquals(1.414, coordinateCalc.calcProc(), 0.001);
    }

    @Test
    public void checkUserInputSuccess() {
        String userInputString = "(0,0)-(4,5)";
        List<Point> points;

        points = Input.getSplitedUserInputString(userInputString);
        assertTrue(Input.checkPointRange(points));
    }

    @Test
    public void checkUserInputFail() {
        String userInputString = "(200,10)-(114,15)";
        List<Point> points;

        points = Input.getSplitedUserInputString(userInputString);
        assertFalse(Input.checkPointRange(points));
    }

    @Test
    public void getUserInputString() {
        List<Point> result = Input.getSplitedUserInputString("(10,10)-(14,15)");

        assertEquals(10, result.get(0).getX(), 0.001);
        assertEquals(10, result.get(0).getY(), 0.001);
        assertEquals(14, result.get(1).getX(), 0.001);
        assertEquals(15, result.get(1).getY(), 0.001);
    }
}