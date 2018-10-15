import domain.Line;
import util.Parcer;
import domain.Point;
import domain.PointList;

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
            Parcer parcer = new Parcer(getCoordinateValue());
            PointList pl = new PointList(parcer.makePostion());
            List<Point> pointList = pl.makePointList();     //pointList에 모든 point들을 담는다
            Line line = new Line(pointList);

            printCoordinate(pointList);
            printLineLength(line.calcLength());
        } catch (Exception e) {
            System.out.println("좌표값을 잘못 입력했습니다. 다시 입력하세요.");
            start();
        }
    }
}