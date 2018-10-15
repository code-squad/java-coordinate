package coordinate.domain;

import java.util.ArrayList;

public class Triangle {
    private ArrayList<Point> points;

    public Triangle(ArrayList<Point> points) {
        this.points = points;
    }

    public String calculate() {
        if (this.points.size() < 3) {
            return "사각형이 아닙니다.";
        }
        if (isTriangle().equals(false)) {
            throw new IllegalArgumentException("사각형이 아닙니다.");
        }
        double[] a = findLine();
        double s = (a[0] + a[1] + a[2]) / 2;
        double result = Math.sqrt(s * (s - a[0]) * (s - a[1]) * (s - a[2]));
        return "삼각형의 면적은 " + result + " 입니다.";
    }

    private Boolean isTriangle() {
        return true;
    }

    private double[] findLine() {
        double[] lines = new double[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = points.get(i).calculateLIne(points.get((i+ 1) % 3));
        }
        return lines;
    }
}
