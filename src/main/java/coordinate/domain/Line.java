package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<String> points;

    public Line() {
        this.points = new ArrayList<>();
    }

    public Line(List<String> points) {
        this.points = points;
    }

    public List<String> getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }
}
