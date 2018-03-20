package coordinate;

import coordinate.domain.CoordinateCalculator;
import coordinate.domain.Utils;
import coordinate.view.Input;
import coordinate.view.Output;

import java.util.List;

public class CoordinateCalculatorConsole {

    public static void main(String[] args) {
        CoordinateCalculator cc = new CoordinateCalculator();
        Output.printGraph(cc);


    }

    public static String[] promptUserInput() {
        String coordinates = Input.takeCoordinates();
        return Utils.checkInputFormat(coordinates);
    }

    public static List<Integer[]> convertToCoordinates(String[] input) {
        return Utils.toIntegerCoordinates(input);
    }
}