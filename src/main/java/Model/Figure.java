package Model;

import java.util.ArrayList;

public class Figure {

    private static ArrayList<Point> points = new ArrayList<>();

    public void calculateArea() {
    }

    public void setCoordinates(ArrayList<String> coordinates) {
        for (String coordinate : coordinates) {
            String[] pair = coordinate.split(",");
            points.add(Point.of(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
        }
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public boolean isAtCoordinate(int x, int y) {
        return points.contains(Point.of(x, y));
    }
}
