package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figure figure = initShape();
        CoordinateCalculator calculator = initCalculator(figure);

        printResult(calculator, figure);
    }

    private static Figure initShape() {
        Figure figure;
        try {
            Output.printMessage("선이나 직사각형 좌표를 다음과 같은 포맷으로 입력해주세요.\n" +
                    "선일 경우: (1,2)-(3,4)\n" +
                    "직사각형일 경우: (0,0)-(1,0)-(0,1)-(1,1)\n" +
                    "삼각형일 경우: (1,1)-(5,5)-(10,8)");
            List<Point> points = Utils.processCoordinates(Input.takeCoordinates());
            figure = Factory.ofShape(points);
        } catch (IllegalArgumentException e) {
            return initShape();
        }
        return figure;
    }

    private static CoordinateCalculator initCalculator(Figure figure) {
        return new CoordinateCalculator(figure);
    }

    private static void printResult(CoordinateCalculator cc, Figure figure) {
        Output.printFigure(cc);

        if (figure instanceof Line) {
            Output.printLength(figure);
        }
        if (figure instanceof Square) {
            Output.printSquareArea(figure);
        }
        if (figure instanceof Triangle) {
            Output.printTriangleArea(figure);
        }
    }
}