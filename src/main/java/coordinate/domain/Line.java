package coordinate.domain;

import java.util.ArrayList;

public class Line {
    private ArrayList<Point> points;

    public Line(ArrayList<Point> points) {
        this.points = points;
    }
    public String calculate() {
        if (points.size() == 2) {
            return  "직선의 길이는 " + points.get(0).calculateLIne(points.get(1)) + " 입니다.";
        }
        return "직선이 아닙니다.";
    }

}
