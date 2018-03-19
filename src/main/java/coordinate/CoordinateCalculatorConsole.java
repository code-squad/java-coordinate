package coordinate;

import coordinate.domain.CoordinateCalculator;
import coordinate.view.Output;

public class CoordinateCalculatorConsole {

    public static void main(String[] args) {
        CoordinateCalculator cc = new CoordinateCalculator();
        Output.printGraph(cc);
    }
}
