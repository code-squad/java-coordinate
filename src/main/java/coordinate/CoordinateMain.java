package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.FigureFactory;
import coordinate.domain.Point;
import coordinate.dto.PointDtoFactory;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;

import java.util.List;

public class CoordinateMain extends IllegalAccessException {
    public static void main(String[] args) {
        List<Point> points;
        try {
            points = InputView.input();
            PointDtoFactory pointDtoFactory = new PointDtoFactory(points);

            Coordinate coordinate = new Coordinate();
            coordinate.drawPoint(pointDtoFactory.getPointDTO());

            ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
            resultView.displayCoordinate();
            resultView.displayResult(FigureFactory.create(points));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
