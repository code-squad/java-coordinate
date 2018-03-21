import domain.Line;
import domain.figure.Rectangle;
import domain.point.Points;
import view.Input;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        Main.start();
    }

    private static void start() {
        Points pointRepo = getPoints();
        Viewer.viewCoordinate(pointRepo);

        doSomething(pointRepo);
    }

    // TODO : 분기문 처리 어떻게 이쁘게 만들지 고민해보기
    private static void doSomething(Points points) {
        switch (points.getSavedSize()) {
            case Line.VALID_COORDINATE_NUM :
                Line line = new Line(points);
                Viewer.viewDistance(line.calcDistance());
                break;

            case Rectangle.VALID_COORDINATE_NUM :
                Rectangle rectangle = new Rectangle(points);
                Viewer.viewWidth(rectangle.calcArea());
                break;
        }
    }

    private static Points getPoints() {
        Points pointRepo = null;
        try {
            pointRepo = Input.getPoints("좌표를 입력하세요.");
        } catch (IllegalArgumentException e) {
            Viewer.viewMessage(e.getMessage());
            pointRepo = getPoints();
        }
        return pointRepo;
    }
}
