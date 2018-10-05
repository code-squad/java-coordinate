package coordinate;

import java.util.ArrayList;

public class CoordinateLine {
    private static final int MAXNUMS = 25;

    private ArrayList<MyString> coordinateLine;
    public CoordinateLine() {
        this.coordinateLine = makeLine();
    }

    public ArrayList<MyString> makeLine() {
        ArrayList<MyString> line = new ArrayList<>();
        for (int i = 0; i < MAXNUMS; i++) {
            line.add(new MyString());
        }
        return line;
    }

    public ArrayList<MyString> getCoordinateLine() {
        return coordinateLine;
    }

    @Override
    public String toString() {
        String lineToString = "";
        for (int i = 1; i < MAXNUMS; i++) {
            lineToString += this.coordinateLine.get(i);
        }
        return lineToString;
    }
}
