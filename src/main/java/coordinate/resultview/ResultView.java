package coordinate.resultview;

import coordinate.domain.CoordinateYLine;
import coordinate.utils.CoordinateString;

import java.util.ArrayList;

public class ResultView {
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


    public void toDisplay(String result) {
        displayCoordinate();
        System.out.println(result);
    }

    public void displayCoordinate() {
        displayYCoordinate();
        displayXCoordinate();
    }
}
