package coordinate.domain;

import coordinate.utill.AxisCondition;

import java.util.Arrays;

public class Point {
    private int x;
    private int y;

    private Point(int x, int y) {
        if (x < AxisCondition.MIN_AXIS || x > AxisCondition.MAX_AXIS ||
                y < AxisCondition.MIN_AXIS || y > AxisCondition.MAX_AXIS) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(Math.abs(other.x - this.x), 2) + Math.pow(Math.abs(other.y - this.y), 2));
    }

    public boolean equalToAxisOfX(int other){
        return x == other;
    }

    public boolean equalToAxisOfY(int other){
        return y == other;
    }

    public int[] sort(Point other){
        int[] values = new int[]{x, other.x};
        Arrays.sort(values);
        return values;
    }
}
