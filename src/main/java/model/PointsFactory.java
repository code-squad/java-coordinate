package model;

import java.util.ArrayList;
import java.util.List;

public class PointsFactory {

    public static List<Point> makePoints(String coordinates) {
        String[] groups = Parser.makeStrings(coordinates);
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            points.add(PointCreator.position(groups[i]));
        }
        return points;
    }
}
