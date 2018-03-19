import domain.Coordinate;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        Main.start();
    }

    private static void start() {
        Coordinate coordinate = Coordinate.of();
        Viewer.viewCoordinate(coordinate);
    }
}
