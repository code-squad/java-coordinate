package Model;

import java.util.ArrayList;

public class Figure {
    private ArrayList<Point> points;

    public void calculateArea() {
    }

    public void setPoint(ArrayList<String> coordinatePairs) {
        for (String coordinatePair : coordinatePairs) {
            String[] pair = coordinatePair.split(",");
            points.add(Point.of(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
        }
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
}
