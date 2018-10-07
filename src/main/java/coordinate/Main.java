package coordinate;

import coordinate.domain.Coordinate;
import coordinate.view.ResultView;

public class Main {
    public static void main(String[] args) {
        Coordinate c = new Coordinate(25);

        ResultView.viewCoordinate(c);
    }
}
