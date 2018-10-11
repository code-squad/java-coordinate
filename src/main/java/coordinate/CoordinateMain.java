package coordinate;

import coordinate.domain.Point;
import coordinate.utill.Parser;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateMain {
    public static void main(String[] args) {
        while (true) {
            try {
                run();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("값의 범위가 잘못 입력되었습니다.");
            }
        }
    }

    public static void run() {
        String[] points = Parser.parenthesisRemove(Parser.deshSeparator(InputView.getLocation()));

        Point firstPoint = Point.ofCommaSeparator(points[0]);
        Point secondPoint = Point.ofCommaSeparator(points[1]);

        ResultView.createLocationAxis(firstPoint, secondPoint);
        ResultView.distView(firstPoint.distance(secondPoint));
    }
}