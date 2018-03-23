package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;
    private List<Row> rows;

    public CoordinateCalculator(List<Point> points) {
        this.rows = calculatorInit(points);
    }


    private static List<Row> calculatorInit(List<Point> points) {
        List<Row> rows = new ArrayList<>();
        for (int y = 0; y <= RANGE; y++) {
            rows.add(addRow(points, y));
        }
        return rows;
    }

    private static Row addRow(List<Point> points, int y) {
        return new Row(Points.getXOnRowY(points, y)); //point가 있는 y번째 row에 x좌표
    }

    public String buildCalc() {
        return Builder.startBuild(rows);
    }
}