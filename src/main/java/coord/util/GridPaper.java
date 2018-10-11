package coord.util;

import coord.domain.Point;

import java.util.List;
import java.util.Objects;

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
        drawAxisOfX();
        drawNumberOfXAxis();
    }

    private void drawAxisOfY(List<Point> points) {
        StringBuilder[] axisY = drawNumberOfYAxis();
        markPoints(points, axisY);
        append(axisY);
    }

    private StringBuilder[] drawNumberOfYAxis() {
        StringBuilder[] ret = new StringBuilder[size + 1];
        for (int i = 0; i <= size; i++) {
            ret[i] = new StringBuilder();
            ret[i].append(String.format("%" + offset + "d|", i));
            ret[i].append(repeatLetter(BLANK, offset * (size + 1)));
        }
        return ret;
    }

    private void markPoints(List<Point> points, StringBuilder[] axisY) {
        for (Point point : points) {
            //y축의 길이와 눈금 하나의 길이를 고려해서 점을 찍는다.
            axisY[point.y].replace(
                    offset + ((point.x + 1) * offset),
                    offset + ((point.x + 1) * offset) + 1,
                    POINT_MARKER);
        }
    }

    private void append(StringBuilder[] yAxisFactors) {
        for (int i = size; i >= 0; i--) {
            stringBuilder.append(yAxisFactors[i]);
            lineBreak();
        }
    }

    private void drawAxisOfX() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GridPaper gridPaper = (GridPaper) o;
        return size == gridPaper.size &&
                offset == gridPaper.offset &&
                Objects.equals(stringBuilder, gridPaper.stringBuilder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, offset, stringBuilder);
    }
}
