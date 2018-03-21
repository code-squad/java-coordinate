package coordinate;

import coordinate.domain.CoordinateCalculator;
import coordinate.domain.Points;
import coordinate.domain.Utils;
import coordinate.view.Input;
import coordinate.view.Output;

public class Main {

    public static void main(String[] args) {
        Points points = promptUserInput();

        CoordinateCalculator cc = new CoordinateCalculator(points);

        Output.printGraph(cc);
        Output.printDistance(cc);
    }

    private static Points promptUserInput() {
        Points points;
        try {
            Output.printMessage("좌표를 다음과 같은 포맷으로 입력해주세요: (1,2)-(3,4)");
            String[] input = Utils.checkInputFormat(Input.takeCoordinates());
            points = new Points(input);
        } catch (IllegalArgumentException e) {
            return promptUserInput();
        }
        return points;
    }
}