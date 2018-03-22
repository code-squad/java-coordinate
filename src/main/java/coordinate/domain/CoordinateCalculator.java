package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows;
    private final Points points;

    public CoordinateCalculator(Points points) {
        this.points = points;
        this.rows = calculatorInit(points);
    }

    public static List<Row> calculatorInit(Points points) {
        List<Row> rows = new ArrayList<>();
        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(points, y));
        }
        return rows;
    }

    private static Row addRow(Points points, int y) {
        return new Row(points.getXOnRowY(y)); //point가 있는 y번째 row에 x좌표
    }

    public String buildCalc() {
        return Builder.startBuild(rows);
    }

    public double calculateDistance() {
        return points.calculateDistance();
    }
}