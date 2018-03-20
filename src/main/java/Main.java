import domain.coordinate.CoordinateCalculator;
import domain.point.Points;
import view.Input;
import view.Viewer;

public class Main {
    private static final int VALID_COORDINATE_NUM = 2;

    public static void main(String[] args) {
        Main.start();
    }

    private static void start() {
        Points pointRepo = getPoints();
        Viewer.viewCoordinate(pointRepo);
        Viewer.viewDistance(CoordinateCalculator.calcDistance());
    }

    private static Points getPoints() {
        Points pointRepo = null;
        try {
            pointRepo = Input.getPoints("좌표를 입력하세요.", VALID_COORDINATE_NUM);
        } catch (IllegalArgumentException e) {
            Viewer.viewMessage(e.getMessage());
            pointRepo = getPoints();
        }
        return pointRepo;
    }
}
