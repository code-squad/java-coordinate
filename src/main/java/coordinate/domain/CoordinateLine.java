package coordinate.domain;

import coordinate.utils.CoordinateString;

import java.util.ArrayList;

public class CoordinateLine {
    private static final int MAXiMUM_NUM = 24;

    private ArrayList<CoordinateString> coordinateLine;
    public CoordinateLine() {
        this.coordinateLine = makeLine();
    }

    public ArrayList<CoordinateString> makeLine() {
        ArrayList<CoordinateString> line = new ArrayList<>();
        for (int i = 0; i <= MAXiMUM_NUM; i++) {
            line.add(new CoordinateString());
        }
        return line;
    }

    public ArrayList<CoordinateString> getCoordinateLine() {
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
