package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows = new ArrayList<>();
    private final Points points;

    public CoordinateCalculator(Points points) {
        this.points = points;
        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(points, y));
        }
    }

    private Row addRow(Points points, int y) {
        return new Row(points.getXOnRowY(y)); //point가 있는 y번째 row에 x좌표
    }

    public String buildCalc() {
        return Builder.startBuild(rows);
    }

    public double calculateDistance() {
        return points.calculateDistance();
    }
}