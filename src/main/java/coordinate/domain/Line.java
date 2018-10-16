package coordinate.domain;

import java.util.ArrayList;

public class Line extends Figure {

    public Line(ArrayList<Point> points) {
        this.points = points;
        this.name = "직선";
        this.size = 2;
    }

    public void calculate() {
        this.result = points.get(0).calculateLIne(points.get(1));
    }

}
