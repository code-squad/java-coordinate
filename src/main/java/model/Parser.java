package model;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static String coordinates;

    public static String[] makeStrings(String coordinate) {
        coordinates = coordinate;
        String removeBraket = coordinate.replace("(", "").replace(")", "");
        String[] groups = removeBraket.split("-");
        return groups;
    }

    public static List<Point> makePoints() {
        String[] groups = makeStrings(coordinates);
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            points.add(Point.position(groups[i]));
        }
        return points;
    }


    public static double makeFigures() {
        List points = makePoints();
        Figures figures = new Figures();
        return figures.select(points.size());
    }
}