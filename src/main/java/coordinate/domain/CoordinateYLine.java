package coordinate.domain;

import coordinate.utils.CoordinateString;

import java.util.ArrayList;
import java.util.List;

public class CoordinateYLine {
    private static final int MAXiMUM_NUM = 24;

    private List<CoordinateString> coordinateLine;

    public CoordinateYLine() {
        this.coordinateLine = makeLine();
    }

    private List<CoordinateString> makeLine() {
        List<CoordinateString> line = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            line.add(new CoordinateString());
        }
        return line;
    }

    void toMarking(int xPoint) {
        this.coordinateLine.get(xPoint).toMarking();
    }

    public List<CoordinateString> getCoordinateLine() {
        return coordinateLine;
    }

    @Override
    public String toString() {
        String lineToString = "";
        for (int i = 1; i <= MAXiMUM_NUM; i++) {
            lineToString += this.coordinateLine.get(i);
        }
        return lineToString;
    }
}
