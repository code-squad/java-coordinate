package coordinate.domain;

import java.util.List;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "사각형";
    }

    @Override
    public double area() {
        for (int i = 1; i < points.size(); i++) {
            if (points.get(0).equalToAxisOfX(points.get(i))) {
                width = points.get(0).distance(points.get(i));
            }
            if (points.get(0).equalToAxisOfY(points.get(i))) {
                height = points.get(0).distance(points.get(i));
            }
        }
        if (width * height == 0) {
            throw new IllegalArgumentException("좌표를 정확하게 입력하세요.");
        }

        return width * height;
    }

}
