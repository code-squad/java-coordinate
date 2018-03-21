package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows = new ArrayList<>();
    private final Coordinates coordinates;

    public CoordinateCalculator(String[] coords) {

        coordinates = new Coordinates(coords);

        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(coordinates, y));
        }
    }

    private Row addRow(Coordinates coords, int y) {
        if (coords.containsY(y)) {
            int x = coords.getXIndex(y);
            return new Row(x);
        }
        return new Row(-1);
    }

    public String buildCalc() {
        return Builder.startBuild(rows);
    }

    public double calculateDistance(){
        return coordinates.calculateDistance();
    }
}