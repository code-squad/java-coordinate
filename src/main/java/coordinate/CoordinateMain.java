package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.Point;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());

        ArrayList<Point> points = InputView.input();

        resultView.disPlay(points);
    }
}
