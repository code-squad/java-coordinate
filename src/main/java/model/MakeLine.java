package model;

public class MakeLine {

    private Point aPoints;
    private Point bPoints;

    public Line makeLine(String coordinate) throws Exception {
        String removeBraket = coordinate.replace("(", "").replace(")", "");
        String[] groups = removeBraket.split("-");
        Point a = Point.position(groups[0]);
        aPoints = a;
        Point b = Point.position(groups[1]);
        bPoints = b;
        Line line = new Line(a, b);
        return line;
    }

    public Point getaPoints() {
        return aPoints;
    }

    public Point getbPoints() {
        return bPoints;
    }
}