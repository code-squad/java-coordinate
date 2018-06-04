package coordinate.domain;

import java.util.List;

public class Square extends Figure implements Figure.Area {

    public Square(List<String> points) {
        super(points);
    }

    //굳이 super를 쓰지 않아도 된다.
    //super 사용하지 않고 구현한다.

    private int width() {
        return (int) getDistance(0, 1);
    }

    private int height() {
        return (int) getDistance(1, 2);
    }

    @Override
    public double area() {
        return width() * height();
    }
}
