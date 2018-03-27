package domain;

import java.util.ArrayList;

public class LineList {
    private ArrayList<Line> lines = new ArrayList<>();
    private static LineList lineList = new LineList();

    private LineList() {
        // nothing
    }

    public static LineList getInstance() {
        return lineList;
    }

    public void makeLines(ArrayList<Point> points) {
        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i; j < points.size() - 1; j++) {
                this.lines.add(new Line(points.get(i), points.get(j + 1)));
            }
        }
    }

    public ArrayList<Line> getLines() {
        return this.lines;
    }

    public double getLineDistance(int index) {
        Line line = lines.get(index);
        return line.getDistance();
    }
}
