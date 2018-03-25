package saru;

import saru.domain.*;
import saru.view.*;

import java.util.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class CoordinateCalcTest {
    private static final int MAX_VALUE = 24;

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

        Set<Point> points = new HashSet<>();
        points.add(point1);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        coordinateCalc.drawPoint(points.iterator().next());

        RowLine foundRowLines = coordinateCalc.getRowLines().get(MAX_VALUE - 4);
        Point foundPoint = foundRowLines.getPoints().get(4);
        assertThat(foundPoint.isExist(), is(true));
    }

    @Test
    public void calcLine() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);

        assertEquals(1.414, coordinateCalc.calcProc(), 0.001);
    }

    @Test
    public void checkUserInputSuccess() {
        String userInputString = "(0,0)-(4,5)";
        Input.getSplitedUserInputString(userInputString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkUserInputFail() {
        String userInputString = "(200,10)-(114,15)";
        Input.getSplitedUserInputString(userInputString);
    }

    @Test
    public void checkPointsNum() {
        // 해쉬셋에 저장한다. 중복과 관련.
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);

        // 갯수를 확인한다
        assertEquals(2, points.size());
    }

    @Test
    public void checkShapeType() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        Set<Point> userInput = coordinateCalc.getUserInput();
        CoordinateCalc.SHAPE_TYPE shapeType = coordinateCalc.checkShapeType(userInput);

        assertEquals(CoordinateCalc.SHAPE_TYPE.LINE, shapeType);
    }
}