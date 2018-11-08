package model;

import java.util.List;

public class Parser {

    public static String[] makeStrings(String coordinate) {
        String removeBraket = coordinate.replace("(", "").replace(")", "");
        String[] groups = removeBraket.split("-");
        return groups;
    }

    public static AbstractFigures makeFigures(List<Point> points) {
        Figures figures = new Figures(points);
        return figures.select(points.size());
    }
}