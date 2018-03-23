package domain;

import java.util.ArrayList;
import java.util.List;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ArrayList<Point> makePoints(List<String> numbers) {
        ArrayList<Point> points = new ArrayList<>();
        int x, y;
        for (int i = 0; i < numbers.size(); i = i + 2) {
            x = Integer.parseInt(numbers.get(i));
            y = Integer.parseInt(numbers.get(i+1));
            points.add(new Point(x, y));
        }
        return points;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x : " + this.x + ", y : " + this.y;
    }
}
