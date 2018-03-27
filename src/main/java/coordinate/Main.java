package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figure figure = promptUser();
        CoordinateCalculator calculator = initCalculator(figure);

        printResult(calculator, figure);
    }

    private static Figure promptUser() {
        Figure figure;
        try {
            Output.printMessage("선이나 직사각형 좌표를 다음과 같은 포맷으로 입력해주세요.\n" +
                    "선일 경우: (1,2)-(3,4)\n" +
                    "직사각형일 경우: (0,0)-(1,0)-(0,1)-(1,1)\n" +
                    "삼각형일 경우: (1,1)-(5,5)-(10,8)");
            List<Point> points = Utils.processCoordinates(Input.takeCoordinates());
            figure = initFigure(points);
        } catch (IllegalArgumentException e) {
            return promptUser();
        }
        return figure;
    }

    private static Figure initFigure(List<Point> points) {
        Figure figure = Figure.ofFigure(points);
        if (figure == null) {
            Output.printMessage("선, 삼각형이나 사각형의 좌표가 아닙니다.");
            return promptUser();
        }
        if (figure.isDuplicate()) {
            Output.printErrorMessage(points);
            return promptUser();
        }
        return figure;
    }

    private static CoordinateCalculator initCalculator(Figure figure) {
        return new CoordinateCalculator(figure);
    }

    private static void printResult(CoordinateCalculator cc, Figure figure) {
        Output.printFigure(cc);
        Output.printCalculationResult(figure);
    }
}