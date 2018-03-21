package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows = new ArrayList<>();
    private final Coordinates coordinates;

    public CoordinateCalculator(Coordinates coordinates) {
        this.coordinates = coordinates;
        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(coordinates, y));
        }
    }

    private Row addRow(Coordinates coords, int y) {
        if (coords.containsY(y)) {
            int x = coords.getXIndex(y);
            return Row.ofPointOnRow(x);
        }
        return Row.ofPointNotOnRow();
    }

    public String buildCalc() {
        return Builder.startBuild(rows);
    }

    public double calculateDistance() {
        return coordinates.calculateDistance();
    }
}