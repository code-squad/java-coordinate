package saru;

import saru.domain.*;
import saru.view.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class InputTest {
    private Set<Point> points;

    @Before
    public void init() {
        points = new HashSet<>();
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
        addSetNormalValues();

        // 갯수를 확인한다
        assertEquals(2, points.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPointsNumFail() {
        addSetTooManyValues();

        new CoordinateCalc(points).calcProc();
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPointsNumFailSame() {
        addSetSameValues();
        new CoordinateCalc(points).calcProc();
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPointsAreaFailSame() {
        addSetInvalidlValues();
        new CoordinateCalc(points).calcProc();
    }

    private void addSetNormalValues() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        points.add(point1);
        points.add(point2);
    }

    private void addSetInvalidlValues() {
        Point point1 = new Point(3, 30, true);
        Point point2 = new Point(4, 4, true);

        points.add(point1);
        points.add(point2);
    }

    private void addSetSameValues() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(3, 3, true);

        points.add(point1);
        points.add(point2);
    }

    private void addSetTooManyValues() {
        addSetNormalValues();
        Point point3 = new Point(6, 7, true);
        Point point4 = new Point(8, 9, true);
        Point point5 = new Point(10, 11, true);

        points.add(point3);
        points.add(point4);
        points.add(point5);
    }
}
