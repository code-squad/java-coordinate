package coordinate;

import coordinate.domain.*;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculable figure = promptUser();
        CoordinateCalculator calculator = new CoordinateCalculator(figure);
        printResult(calculator, figure);
    }

    private static Calculable promptUser() {
        Calculable figure;
        try {
            Output.printMessage("선, 삼각형이나 직사각형 좌표를 다음과 같은 포맷으로 입력해주세요.\n" +
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

    private static Calculable initFigure(List<Point> points) throws IllegalArgumentException {
        Calculable figure = Factory.ofFigure(points);
        if (figure.isDuplicate() && figure.getType().equals("Line")) {
            Output.printMessage("중복되는 좌표가 있습니다. 두 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        if (figure.isDuplicate() && figure.getType().equals("Square")) {
            Output.printMessage("중복되는 좌표가 있습니다. 네 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        if (figure.isDuplicate() && figure.getType().equals("Triangle")) {
            Output.printMessage("중복되는 좌표가 있습니다. 세 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return figure;
    }

    private static void printResult(CoordinateCalculator cc, Calculable figure) {
        Output.printFigure(cc);
        Output.printCalculationResult(figure);
    }
}