import domain.Line;
import domain.figure.Figure;
import domain.figure.FigureCreator;
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
        if (Line.VALID_COORDINATE_NUM == pointRepo.getSavedSize()) {
            viewCalcDistance(pointRepo);
            return;
        }
        viewCalcArea(pointRepo);
    }

    private static void viewCalcDistance(Points pointRepo) {
        Line line = new Line(pointRepo);
        Viewer.viewDistance(line);
    }

    private static void viewCalcArea(Points pointRepo) {
        Figure figure = FigureCreator.create(pointRepo);
        Viewer.viewArea(figure);
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
