package domain;

import java.util.ArrayList;
import java.util.List;

public class LineList {
    private List<Line> lines;

    public LineList(List<Point> points) {
        makeLines(points);
    }

    private void makeLines(List<Point> points) {
        lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i; j < points.size() - 1; j++) {
                lines.add(new Line(points.get(i), points.get(j + 1)));
            }
        }
    }

    public List<Line> getLines() {
        return lines;
    }

    public double getLineDistance(int index) {
        Line line = lines.get(index);
        return line.getDistance();
    }
}
