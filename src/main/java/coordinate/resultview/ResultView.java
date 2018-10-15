package coordinate.resultview;

import coordinate.domain.*;
import coordinate.utils.CoordinateString;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultView {
    private static final int FOUR = 4;
    private static final int T = 3;
    private static final int TWO = 2;

    private static final int MAXiMUM_NUM = 24;
    private static final String DASH = "---";
    private static final String PLUS = "   +";
    private static final String BAR = "l";

    private ArrayList<CoordinateString> coordinateAxis;
    private ArrayList<CoordinateYLine> coordinatePlane;

    public ResultView(ArrayList<CoordinateString> coordinateAxis, ArrayList<CoordinateYLine> coordinatePlane) {
        this.coordinateAxis = coordinateAxis;
        this.coordinatePlane = coordinatePlane;
    }

    private void displayYCoordinate() {
        for (int i = MAXiMUM_NUM; i > 0; i--) {
            System.out.println(this.coordinateAxis.get(i) + BAR + this.coordinatePlane.get(i));
        }
    }

    private void displayXCoordinate() {
        System.out.print(PLUS);
        for (int i = 0; i < MAXiMUM_NUM; i++) {
            System.out.print(DASH);
        }
        System.out.println();

        for (CoordinateString coordinateAxis : this.coordinateAxis) {
            System.out.print(coordinateAxis);
        }

        System.out.println();
    }

    public void toDo(ArrayList<Point> points) {
        HashMap<Integer, String> toDo = new HashMap<>();
        toDo.put(TWO, new Line(points).calculate());
        toDo.put(FOUR, new Rectangle(points).calculate());
        toDo.put(T, new Triangle(points).calculate());
        displayTest();
        System.out.println(toDo.get(points.size()));
    }

    public void displayTest() {
        displayYCoordinate();
        displayXCoordinate();
    }
}
