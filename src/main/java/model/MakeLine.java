package model;

public class MakeLine {

    public static Line makeLine(String coordinate) throws Exception {
        String removeBraket = coordinate.replace("(", "").replace(")", "");
        String[] groups = removeBraket.split("-");
        Point a = Point.position(groups[0]);
        Point b = Point.position(groups[1]);
        return new Line(a, b);
    }
}