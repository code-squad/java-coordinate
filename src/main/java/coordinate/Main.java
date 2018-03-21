package coordinate;

import coordinate.domain.CoordinateCalculator;
import coordinate.domain.Coordinates;
import coordinate.domain.Utils;
import coordinate.view.Input;
import coordinate.view.Output;

public class Main {

    public static void main(String[] args) {
        Coordinates coordinates = promptUserInput();

        CoordinateCalculator cc = new CoordinateCalculator(coordinates);

        Output.printGraph(cc);
        Output.printDistance(cc);
    }

    private static Coordinates promptUserInput() {
        Coordinates coordinates;
        try {
            Output.printMessage("좌표를 다음과 같은 포맷으로 입력해주세요: (1,2)-(3,4)");
            String[] input = Utils.checkInputFormat(Input.takeCoordinates());
            coordinates = new Coordinates(input);
        } catch (IllegalArgumentException e) {
            return promptUserInput();
        }
        return coordinates;
    }
}