package coord.util;

import coord.domain.Point;

import java.util.List;

public class GridPaper {
    private static final String BLANK = " ";
    private static final String PLUS = "+";
    private static final String DASH = "-";
    private static final String POINT_MARKER = "O";
    private int size;
    private int offset;
    private StringBuilder stringBuilder;

    public GridPaper(int size) {
        this.size = size;
        offset = digitOf(size) + 1;
        stringBuilder = new StringBuilder();
    }

    private int digitOf(int size) {
        return String.valueOf(size).length();
    }

    public void draw(List<Point> points) {
        drawAxisOfY(points);
        drawAxisOfX(size);
        drawNumberOfXAxis();
    }

    private void drawAxisOfY(List<Point> points) {
        String[] axisY = drawNumberOfYAxis();
        markPoints(points, axisY);
        append(axisY);
    }

    private String[] drawNumberOfYAxis() {
        String[] ret = new String[size + 1];
        for (int i = 0; i <= size; i++) {
            ret[i] = String.format("%" + offset + "d|", i);
        }
        return ret;
    }

    private void markPoints(List<Point> points, String[] axisY) {
        for (Point point : points) {
            axisY[point.y] += offsetX(point.x);
            axisY[point.y] += marker();
        }
    }

    private String offsetX(int x) {
        return repeatLetter(" ", offset * x);
    }

    private String marker() {
        return String.format("%" + offset + "s", POINT_MARKER);
    }

    private void append(String[] yAxisFactors) {
        for (int i = size; i >= 0; i--) {
            stringBuilder.append(yAxisFactors[i]);
            lineBreak();
        }
    }

    private void drawAxisOfX(int size) {
        stringBuilder.append(repeatLetter(BLANK, offset));
        stringBuilder.append(PLUS);
        stringBuilder.append(repeatLetter(DASH, offset * (size + 1)));
        stringBuilder.append(System.lineSeparator());
    }

    private void drawNumberOfXAxis() {
        stringBuilder.append(repeatLetter(BLANK, offset + 1));
        for (int i = 0; i <= size; i++) {
            stringBuilder.append(String.format("%" + offset + "d", i));
        }
    }

    private String repeatLetter(String value, int time) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < time; i++) {
            tmp.append(value);
        }
        return tmp.toString();
    }

    private void lineBreak() {
        stringBuilder.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
