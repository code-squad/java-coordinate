package saru;

import saru.domain.*;
import saru.view.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CoordinateCalcTest {
    @Test
    public void makePoint() {
        Point point = new Point(0, 0, true);
        assertThat(point.getX(), is(0.0));
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
        Input input = new Input();

        points = input.getSplitedUserInputString(userInputString);
        assertTrue(input.checkPointRange(points));
    }

    @Test
    public void checkUserInputFail() {
        String userInputString = "(200,10)-(114,15)";
        List<Point> points;
        Input input = new Input();

        points = input.getSplitedUserInputString(userInputString);
        assertFalse(input.checkPointRange(points));
    }

    @Test
    public void getUserInputString() {
        Input input = new Input();
        List<Point> result = input.getSplitedUserInputString("(10,10)-(14,15)");

        assertEquals(10, result.get(0).getX(), 0.001);
        assertEquals(10, result.get(0).getY(), 0.001);
        assertEquals(14, result.get(1).getX(), 0.001);
        assertEquals(15, result.get(1).getY(), 0.001);
    }
}