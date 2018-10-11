package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.dto.PointDtoFactory;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        ArrayList<Point> points = InputView.input();

        //dto 만들기
        PointDtoFactory pointDtoFactory = new PointDtoFactory(points);

        Coordinate coordinate = new Coordinate();
        coordinate.drawPoint(pointDtoFactory.getPointDTO());

        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        resultView.disPlay(Line.calculatorLine(points));
    }
}
