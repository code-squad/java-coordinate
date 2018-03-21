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
        viewCalcResult(pointRepo);
    }

    private static void viewCalcResult(Points pointRepo) {
        switch (pointRepo.getSavedSize()) {
            case Line.VALID_COORDINATE_NUM:
                viewCalcDistance(pointRepo);
                break;

            case Rectangle.VALID_COORDINATE_NUM:
                viewCalcArea(pointRepo);
                break;
        }
    }

    private static void viewCalcDistance(Points pointRepo) {
        Line line = new Line(pointRepo);
        Viewer.viewDistance(line.calcDistance());
    }

    private static void viewCalcArea(Points pointRepo) {
        Rectangle rectangle = new Rectangle(pointRepo);
        Viewer.viewWidth(rectangle.calcArea());
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
