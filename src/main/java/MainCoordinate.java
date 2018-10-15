import domain.Line;
import util.Parser;
import domain.Point;
import domain.MakingPoints;

import java.util.List;

import static view.InputView.getCoordinateValue;
import static view.ResultView.printCoordinate;
import static view.ResultView.printLineLength;

public class MainCoordinate {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            List<Integer[]> posIntegerList = Parser.makePosition(getCoordinateValue());
            List<Point> pointList = MakingPoints.makePointList(posIntegerList);
            printCoordinate(pointList);
            printLineLength(new Line().getLength(pointList));
        } catch (Exception e) {
            System.out.println("좌표값을 잘못 입력했습니다. 다시 입력하세요.");
            start();
        }
    }
}