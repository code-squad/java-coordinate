package com.zingoworks.coordinate.domain;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(StringBuilder coord) {
        String[] cod = String.valueOf(coord).split(",");
        this.x = Integer.parseInt(cod[0]);
        this.y = Integer.parseInt(cod[1]);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean alertMaxLimit(Point point) {
        if (point.x > 24 || point.y > 24) {
            System.out.println("<경고> 좌표값은 최대 24까지만 입력할 수 있습니다.");
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point that = (Point) o;
        return x == that.x &&
                y == that.y;
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