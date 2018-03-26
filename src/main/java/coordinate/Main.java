package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape shape = initShape();
        CoordinateCalculator calculator = initCalculator(shape);

        printResult(calculator, shape);
    }

    private static Shape initShape() {
        Shape shape;
        try {
            Output.printMessage("선이나 직사각형 좌표를 다음과 같은 포맷으로 입력해주세요.\n선일 경우: (1,2)-(3,4)\n직사각형일 경우: (0,0)-(1,0)-(0,1)-(1,1)");
            List<Point> points = Utils.processCoordinates(Input.takeCoordinates());
            shape = Shape.ofShape(points);
        } catch (IllegalArgumentException e) {
            return initShape();
        }
        return shape;
    }

    private static CoordinateCalculator initCalculator(Shape shape) {
        return new CoordinateCalculator(shape);
    }

    private static void printResult(CoordinateCalculator cc, Shape shape) {
        Output.printFigure(cc);

        if (shape instanceof Line) {
            Output.printLength(shape);
        }
        if (shape instanceof Square) {
            Output.printArea(shape);
        }
    }
}