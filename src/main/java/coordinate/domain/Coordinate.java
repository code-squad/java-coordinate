package coordinate.domain;

import coordinate.util.Parse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Coordinate {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final String COMMA = ",";

    private List<Point> coordinate = new ArrayList<>();

    private Coordinate() {}

    public static Coordinate of() {
        return new Coordinate();
    }

    public void run(String userInput) throws IllegalArgumentException {
        ArrayList<String> coordinates = Parse.removeBracket(Parse.splitInput(userInput));
        makeCoordinate(coordinates);
        checkOverlap(coordinate);
    }

    void makeCoordinate(ArrayList<String> coordinates) {
        for (String str : coordinates) {
            String[] coordinateEach = str.split(COMMA);
            coordinate.add(Point.ofXY(Integer.parseInt(coordinateEach[ZERO]), Integer.parseInt(coordinateEach[ONE])));
        }
    }

    private static List<Point> checkOverlap(List<Point> coordinate) throws IllegalArgumentException {
        Set<Point> set = new HashSet<>(coordinate);
        if (coordinate.size() != set.size()) throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. 각 점의 위치는 달라야 합니다.");
        return coordinate;
    }

    public List<Point> getCoordinate() {
        return coordinate;
    }

    Point getPoint(int index) {
        return coordinate.get(index);
    }
}
