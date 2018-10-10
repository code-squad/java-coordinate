package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.Point;
import coordinate.dto.CoordinateDto;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        ArrayList<Point> points = InputView.input();

        //dto 만들기
        CoordinateDto coordinateDto = new CoordinateDto(points);

        Coordinate coordinate = new Coordinate();
        coordinate.drawPoint(coordinateDto.getPointDTO());

        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        resultView.disPlay(coordinateDto.getLineResult());
    }
}
