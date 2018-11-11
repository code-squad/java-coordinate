package coordinate.domain;

import coordinate.util.Parse;
import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final String COMMA = ",";

    private List<Point> coordinate = new ArrayList<>();

    private Coordinate() {}

    public static Coordinate of() {
        return new Coordinate();
    }

    public void run(String userInput) {
        ArrayList<String> coordinates = Parse.removeBracket(Parse.splitInput(userInput));
        makeCoordinate(coordinates);
    }

    void makeCoordinate(ArrayList<String> coordinates) {
        for (String str : coordinates) {
            String[] coordinateEach = str.split(COMMA);
            coordinate.add(Point.ofXY(Integer.parseInt(coordinateEach[ZERO]), Integer.parseInt(coordinateEach[ONE])));
        }
    }

    public List<Point> getCoordinate() {
        return coordinate;
    }

    Point getPoint(int index) {
        return coordinate.get(index);
    }
}
