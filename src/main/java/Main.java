import domain.figure.Line;
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
        Line line = makeLine(pointRepo);
        Viewer.viewDistance(line.calcDistance());
    }

    private static Line makeLine(Points pointRepo) {
        Line line = null;
        try {
            line = new Line(pointRepo);
        } catch (IllegalArgumentException e) {
            Viewer.viewMessage(e.getMessage());
        }
        return line;
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
