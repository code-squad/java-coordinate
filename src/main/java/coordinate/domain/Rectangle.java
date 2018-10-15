package coordinate.domain;

import java.util.List;

public class Rectangle extends Figure {
    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "사각형";
    }

    @Override
    public double area() {
        double width = 0;
        double height = 0;

        for (int i = 1; i < getPoints().size(); i++) {
            if (getPoints().get(0).equalToAxisOfX(getPoints().get(i))) {
                width = getPoints().get(0).distance(getPoints().get(i));
            }
            if (getPoints().get(0).equalToAxisOfY(getPoints().get(i))) {
                height = getPoints().get(0).distance(getPoints().get(i));
            }
        }
        if (width * height == 0) {
            throw new IllegalArgumentException("좌표를 정확하게 입력하세요.");
        }

        return width * height;
    }

}
