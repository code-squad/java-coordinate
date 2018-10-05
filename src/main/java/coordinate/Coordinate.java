package coordinate;

import java.util.ArrayList;

public class Coordinate {
    private static final int MAXNUMS = 25;
    private ArrayList<MyString> coordinatePanel;
    private ArrayList<CoordinateLine> coordinateField;
    public Coordinate() {
        this.coordinatePanel = makeCoordinatePanel();
        this.coordinateField = makeCoordinateField();
    }

    private ArrayList<CoordinateLine> makeCoordinateField() {
        ArrayList<CoordinateLine> field = new ArrayList<>();
        for (int i = 0; i < MAXNUMS; i++) {
            field.add(new CoordinateLine());
        }
        return field;
    }

    private ArrayList<MyString> makeCoordinatePanel() {
        ArrayList<MyString> numCoordinate = new ArrayList<>();
        for (int i = 0; i < MAXNUMS; i++) {
            numCoordinate.add(new MyString(i));
        }
        return numCoordinate;
    }

    public void makeStar(int a) {

    }

    public ArrayList<MyString> getCoordinatePanel() {
        return coordinatePanel;
    }

    public ArrayList<CoordinateLine> getCoordinateField() {
        return coordinateField;
    }
}
