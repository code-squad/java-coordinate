package coordinate.domain;

import java.util.List;

public class Triangle extends Figure implements Figure.Area {

    public Triangle(List<String> points) {
        super(points);
    }

    //굳이 super를 쓰지 않아도 된다.
    //super 사용하지 않고 구현한다.
    private double a = getDistance(0, 1);

    private double b = getDistance(1, 2);

    private double c = getDistance(0, 2);

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        return Math.round((result * 100d) / 100d);
    }
}
