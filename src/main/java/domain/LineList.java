package domain;

import java.util.ArrayList;

public class LineList {
    public static ArrayList<Line> lines = new ArrayList<>();

    public static ArrayList<Line> getLines(ArrayList<Point> points) {
        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i; j < points.size() - 1; j++) {
                lines.add(new Line(points.get(i), points.get(j + 1)));
            }
        }
        return lines;
    }
}
