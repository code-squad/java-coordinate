package domain;

import java.util.*;

public class Line {
    List<String> line = new ArrayList<>();

    public Line() {
        initLine();
    }

    private void initLine() {
        for (int i = 0; i < Axis.MAX_SIZE; i++) {
            line.add("  ");
        }
    }

    public void setPoint(Point point) {
        line.set(point.getX() - 1, "()");
    }

    public List<String> getLine() {
        return line;
    }
}
