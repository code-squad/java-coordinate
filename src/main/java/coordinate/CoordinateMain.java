package coordinate;

import coordinate.domain.CoordinatePlane;
import coordinate.domain.Coordinate;
import coordinate.util.InputException;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;


public class CoordinateMain {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        try{
            ArrayList<Coordinate> coordinates  = CoordinatePlane.enterCoordinates(InputView.getPoint());
            CoordinatePlane c = new CoordinatePlane();

            c.checkFigure(coordinates);

            ResultView.drawCoordinatePlane(c, coordinates);
            ResultView.showCalculation(coordinates);
        }  catch (InputException | IllegalArgumentException e) {
            CoordinateMain.run();
        }
    }
}
