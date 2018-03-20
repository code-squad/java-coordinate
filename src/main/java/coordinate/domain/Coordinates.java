package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private List<Integer> xCoord = new ArrayList<>();
    private List<Integer> yCoord = new ArrayList<>();

    Coordinates(List<Integer[]> coordinates) {
        for (Integer[] coordinate : coordinates) {
            this.xCoord.add(coordinate[X_INDEX]);
            this.yCoord.add(coordinate[Y_INDEX]);
        }
    }

    public boolean containsY(int y) {
        return yCoord.contains(y);
    }

    public int getXIndex(int y) {
        return xCoord.get(yCoord.indexOf(y));
    }
}