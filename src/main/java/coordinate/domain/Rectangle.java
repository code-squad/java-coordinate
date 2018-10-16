package coordinate.domain;

import java.util.List;

public class Rectangle extends AbstractFigure {
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

        for (int i = 1; i < getSize(); i++) {
            if (getPoint(0).equalToAxisOfX(getPoint(i))) {
                width = getDist(0, i);
            }
            if (getPoint(0).equalToAxisOfY(getPoint(i))) {
                height = getDist(0, i);
            }
        }
        if (width * height == 0) {
            throw new IllegalArgumentException("좌표를 정확하게 입력하세요.");
        }

        return width * height;
    }

    @Override
    public String outputMessage() {
        return name() + " 넓이는 " + area();
    }
}
