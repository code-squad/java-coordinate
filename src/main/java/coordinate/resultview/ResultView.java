package coordinate.resultview;

import coordinate.domain.CoordinateLine;
import coordinate.utils.CoordinateString;

import java.util.ArrayList;

public class ResultView {
    private static final int MAXiMUM_NUM = 24;
    private static final String DASH = "---";
    private static final String PLUS = "   +";
    private static final String BAR = "l";

    private ArrayList<CoordinateString> coordinateAxis;
    private ArrayList<CoordinateLine> coordinatePlane;

    public ResultView(ArrayList<CoordinateString> coordinateAxis, ArrayList<CoordinateLine> coordinatePlane) {
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

        for (CoordinateString myString : this.coordinateAxis) {
            System.out.print(myString);
        }

        System.out.println();
    }

    public void disPlay(double pointLine) {
        displayYCoordinate();
        displayXCoordinate();
        System.out.println("두 점 사이 거리는 " + pointLine);
    }

    public void displayTest() {
        displayYCoordinate();
        displayXCoordinate();
    }
}
