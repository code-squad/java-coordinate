package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.view.InputView;
import coordinate.view.ResultView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate = Coordinate.of();

        try {
            coordinate.run(InputView.inputCoordinate());
        } catch(RuntimeException e) {
            System.out.println("범위에 맞게 입력해주세요.");
            main(args);
        }

        List<Point> coordinates = coordinate.getCoordinate();
        Line Lines = Line.ofCoordinate(coordinates);

        ResultView.printCoordinate(coordinates, Lines.getLineLength());
    }
}