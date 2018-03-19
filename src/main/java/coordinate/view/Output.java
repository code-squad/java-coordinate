package coordinate.view;

import coordinate.domain.CoordinateCalculator;

public class Output {
    public static void printGraph(CoordinateCalculator cc){
        String result = Builder.buildLines(cc.getLines());
        System.out.println(result);
    }
}
