import domain.coordinate.Coordinate;
import domain.point.Point;
import domain.point.Points;
import view.Input;
import view.Viewer;

import java.util.ArrayList;

public class Main {
    private static final int VALID_COORDINATE_NUM = 2;

    public static void main(String[] args) {
        Main.start();
    }

    private static void start() {
        Points pointRepo = getPoints();
        Coordinate coordinate = new Coordinate(pointRepo);
        Viewer.viewCoordinate(coordinate);

        // TODO : 좌표들을 꺼내와서 좌표지에 표시하는 작업

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
