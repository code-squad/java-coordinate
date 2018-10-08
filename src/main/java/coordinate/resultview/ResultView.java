package coordinate.resultview;

import coordinate.domain.CoordinateLine;
import coordinate.domain.Point;
import coordinate.utils.Calculator;
import coordinate.utils.CoordinateString;

import java.util.ArrayList;

public class ResultView {
    private static final int MAXiMUM_NUM = 24;
    private static final String DASH = "---";
    private static final String PLUS = "   +";
    private static final String BAR = "l";

    private ArrayList<CoordinateString> coordinate;
    private ArrayList<CoordinateLine> field;

    public ResultView(ArrayList<CoordinateString> coordinate, ArrayList<CoordinateLine> field) {
        this.coordinate = coordinate;
        this.field = field;
    }

    private void displayYCoordinate() {
        for (int i = MAXiMUM_NUM; i > 0; i--) {
            System.out.println(this.coordinate.get(i) + BAR + this.field.get(i));
        }
    }

    private void displayXCoordinate() {
        System.out.print(PLUS);
        for (int i = 0; i < MAXiMUM_NUM; i++) {
            System.out.print(DASH);
        }
        System.out.println();

        for (CoordinateString myString : this.coordinate) {
            System.out.print(myString);
        }

        System.out.println();
    }

    public void disPlay(ArrayList<Point> points) {
        for (Point point : points) {
            field.get(point.getYPoint()).getCoordinateLine().get(point.getXPoint()).toStar();
        }
        displayYCoordinate();
        displayXCoordinate();
        System.out.println("두 점 사이 거리는 " + Calculator.line(points));
    }

    public void displayTest() {
        displayYCoordinate();
        displayXCoordinate();
    }
}
