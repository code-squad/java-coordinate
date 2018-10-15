import View.CoordinateView;
import domain.Line;
import domain.Parcer;
import domain.Point;

import java.util.List;

import static View.InputView.getCoordinateValue;
import static View.ResultView.printCoordinate;
import static View.ResultView.printLineLength;

public class MainCoordinate {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            Parcer parcer = new Parcer(getCoordinateValue());
            List<Integer[]> pos = parcer.makePostion();
            Point p1 = new Point(pos.get(0)[0], pos.get(0)[1]);
            Point p2 = new Point(pos.get(1)[0], pos.get(1)[1]);
            Line line = new Line(p1, p2);

            CoordinateView cv = new CoordinateView();
            cv.makeCoordinate();
            cv.drawDot(p1.findPointInedx());
            cv.drawDot(p2.findPointInedx());
            printCoordinate(cv.getCoordinateSb());
            printLineLength(line.calcLength());
        } catch (Exception e) {
            System.out.println("좌표값을 잘못 입력했습니다. 다시 입력하세요.");
            start();
        }
    }
}