package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.FigureFactory;
import coordinate.domain.Point;
import coordinate.dto.PointDtoFactory;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;

import java.util.ArrayList;

public class CoordinateMain extends IllegalAccessException {
    public static void main(String[] args) {
        ArrayList<Point> points;
        try {
            points = InputView.input();
            PointDtoFactory pointDtoFactory = new PointDtoFactory(points);

            Coordinate coordinate = new Coordinate();
            coordinate.drawPoint(pointDtoFactory.getPointDTO());

            ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
            resultView.toDisplay(FigureFactory.create(points).result());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
