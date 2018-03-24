package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Point> points = promptUserInput();

        Shape shape = Shape.ofShape(points);
        CoordinateCalculator cc = new CoordinateCalculator(points);

        printResult(cc, shape);
    }

    private static List<Point> promptUserInput() {
        List<Point> points;
        try {
            Output.printMessage("좌표를 다음과 같은 포맷으로 입력해주세요: (1,2)-(3,4)");
            points = Utils.processCoordinates(Input.takeCoordinates());
        } catch (IllegalArgumentException e) {
            return promptUserInput();
        }
        return points;
    }

    private static void printResult(CoordinateCalculator cc, Shape shape) {
        Output.printFigure(cc);

        if (Shape.isLine(shape)) {
            Output.printLength(shape);
        }
        if (Shape.isSquare(shape)) {
            Output.printArea(shape);
        }
    }
}