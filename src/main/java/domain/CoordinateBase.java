package domain;

import java.util.ArrayList;
import java.util.Collections;

public class CoordinateBase {
    private ArrayList<Line> lines;

    public CoordinateBase(ArrayList<Point> points) {
        baseSetup(points);
    }

    private void baseSetup(ArrayList<Point> points) {
        this.lines = new ArrayList<>(Collections.nCopies(24,null));
        for (Point point : points) {
            Line.addLine(point.getX()-1, point.getY()-1, lines); // 0부터 시작하는 것 보정
        }
    }

    public ArrayList<Line> getLines() {
        return lines;
    }
}
