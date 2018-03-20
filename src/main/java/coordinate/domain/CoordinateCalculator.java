package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows = new ArrayList<>();

    public CoordinateCalculator(List<Integer[]> coordinates) {
        Coordinates coords = new Coordinates(coordinates);

        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(coords, y));
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
}