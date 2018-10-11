package coordinate.domain;

import java.util.ArrayList;

public class Line {

    public static double calculatorLine(ArrayList<Point> points) {
        return  points.get(0).calculateLIne(points.get(1));
    }

}
