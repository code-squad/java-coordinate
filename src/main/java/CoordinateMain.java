import domain.Line;
import domain.figure.Figure;
import domain.figure.FigureFactory;
import domain.point.Point;
import view.Input;
import view.Viewer;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        List<Point> points = getPoints();
        try {
            start(points);
        } catch (IllegalArgumentException e) {
            Viewer.viewMessage(e.getMessage() + "\n 프로그램 오류로 인해 종료합니다(개발자한테 피드백 해주세요.)");
        }
    }

    private static void start(List<Point> points) throws IllegalArgumentException {
        Viewer.viewCoordinate(points);

        if (!Line.isInvalidPointNum(points)) {
            Line line = new Line(points);
            Viewer.viewDistance(line);
            return;
        }

        Figure figure = FigureFactory.of(points);
        Viewer.viewArea(figure);
    }

    private static List<Point> getPoints() {
        List<Point> points;
        try {
            points = Input.getPoints("좌표를 입력하세요.");
        } catch (IllegalArgumentException e) {
            Viewer.viewMessage(e.getMessage());
            points = getPoints();
        }
        return points;
    }
}
