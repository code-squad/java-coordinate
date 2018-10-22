import domain.Rectangle;
import util.Parser;
import domain.Point;
import domain.MakingPoints;

import java.util.List;

import static view.InputView.getCoordinateValue;
import static view.ResultView.printCoordinate;

public class MainCoordinate {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            List<Point> pointList = MakingPoints.makePoints(Parser.makePosition(getCoordinateValue()));
            Rectangle rectangle = new Rectangle(pointList);
            printCoordinate(pointList);
            rectangle.area();
        } catch (Exception e) {
            System.out.println("좌표값을 잘못 입력했습니다. 다시 입력하세요.");
            start();
        }
    }
}