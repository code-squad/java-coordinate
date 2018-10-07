package coordinate.domain;

import java.util.ArrayList;

public class Coordinate {
    ArrayList<Point> coordinate = new ArrayList<>();
    private final int size;

    public Coordinate(int size) {
        this.size = size;

        for (int x = 0; x < size; x++) {
            createCoordinate(size, x);
        }
    }

    private void createCoordinate(int size, int x) {
        for (int y = 0; y < size; y++) {
            coordinate.add(Point.of(x, y));
        }
    }

    public int getSize() {
        return size;
    }
}
