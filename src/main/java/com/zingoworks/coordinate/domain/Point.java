package com.zingoworks.coordinate.domain;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = getVerifiedNumber(x);
        this.y = getVerifiedNumber(y);
    }

    public Point(String str) {
        this.x = getVerifiedNumber(ofCommaSeparator(str).x);
        this.y = getVerifiedNumber(ofCommaSeparator(str).y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public static Point ofCommaSeparator(String str) {
        String[] values = str.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    private int getVerifiedNumber(int number) {
        if (number < 1 || number > 24) {
            throw new IllegalArgumentException("유효한 범위를 초과합니다.");
        }
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}