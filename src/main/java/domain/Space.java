package domain;

import java.util.ArrayList;
import java.util.List;

public class Space {
    private List<Line> lines;

    public Space() {
        initLines();
    }

    private void initLines() {
        lines = new ArrayList<>();
        for (int i = 0; i < Axis.MAX_SIZE; i++) {
            lines.add(new Line());
        }
    }

    public void setPoints(List<Point> points) {
        for (Point point : points) {
            lines.get(point.getY() - 1).setPoint(point);
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}
