package coordinate.domain;

import java.util.ArrayList;

public class Triangle extends Figure{

    public Triangle(ArrayList<Point> points) {
        this.name = "삼각형";
        this.points = points;
        this.size = 3;
    }

    public void calculate() {
        double[] a = findLine();
        double s = (a[0] + a[1] + a[2]) / 2;
        this.result = Math.sqrt(s * (s - a[0]) * (s - a[1]) * (s - a[2]));
    }

    private double[] findLine() {
        double[] lines = new double[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = points.get(i).calculateLIne(points.get((i+ 1) % 3));
        }
        return lines;
    }

}
