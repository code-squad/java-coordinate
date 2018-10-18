package coordinate.resultview;

import coordinate.domain.CoordinateYLine;
import coordinate.domain.Figure;
import coordinate.utils.CoordinateString;

import java.util.List;

public class ResultView {
    private static final int MAXiMUM_NUM = 24;
    private static final String DASH = "---";
    private static final String PLUS = "   +";
    private static final String BAR = "l";

    private List<CoordinateString> coordinateAxis;
    private List<CoordinateYLine> coordinatePlane;

    public ResultView(List<CoordinateString> coordinateAxis, List<CoordinateYLine> coordinatePlane) {
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


    public void displayResult(Figure figure) {
        System.out.println(figure.name()+ "의 면적은 " + figure.area() + " 입니다.");

    }

    public void displayCoordinate() {
        displayYCoordinate();
        displayXCoordinate();
    }

}
