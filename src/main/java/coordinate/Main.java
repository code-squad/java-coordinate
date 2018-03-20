package coordinate;

import coordinate.domain.CoordinateCalculator;
import coordinate.domain.Utils;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer[]> coordinates = convertToCoordinates(promptUserInput());

        CoordinateCalculator cc = new CoordinateCalculator(coordinates);
        Output.printGraph(cc);
    }

    public static String[] promptUserInput() {
        Output.printMessage("좌표를 다음과 같은 포맷으로 입력해주세요: (1,2)-(3,4)");
        String coordinates = Input.takeCoordinates();
        return Utils.checkInputFormat(coordinates);
    }

    private static List<Integer[]> convertToCoordinates(String[] input) {
        return Utils.toIntegerCoordinates(input);
    }
}