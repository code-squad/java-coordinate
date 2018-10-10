package coordinate;

import coordinate.domain.CoordinatePlane;
import coordinate.domain.Coordinate;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;


public class CoordinateMain {
    public static void main(String[] args) {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Coordinate> p = c.enterCoordinates(InputView.getPoint());

        ResultView.drawCoordinatePlane(c, p);
        ResultView.showDistanceCalculation(p);
    }
}
