package coordinate.domain;

import java.util.List;

public class Triangle extends AbstractFigure {
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "삼각형";
    }

    @Override
    public double area() {
        double a = getDist(0,1);
        double b = getDist(1,2);
        double c = getDist(2,0);
        double s = (a + b + c) / 2;

        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String outputMessage() {
        return name() + " 넓이는 " + area();
    }
}
