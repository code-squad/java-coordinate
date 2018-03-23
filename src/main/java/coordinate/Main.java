package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Point> points = promptUserInput();
        CoordinateCalculator cc = new CoordinateCalculator(points);

        printResult(cc, points);
    }

    private static List<Point> promptUserInput() {
        List<Point> points;
        try {
            Output.printMessage("좌표를 다음과 같은 포맷으로 입력해주세요: (1,2)-(3,4)");
            points = Points.processCoordinates(Input.takeCoordinates());
        } catch (IllegalArgumentException e) {
            return promptUserInput();
        }
        return points;
    }

    private static void printResult(CoordinateCalculator cc, List<Point> points) {
        Output.printFigure(cc);
        if (Line.isLine(points)) {
            Output.printDistance(points);
        }
        if (Square.isSquare(points)) {
            Output.printArea(Square.newSquareInstance(points));
        }
    }
}