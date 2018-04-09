package coordinate.domain;

import java.util.List;

public class Line extends Figure{

    public Line(List<String> points) {
        super(points);
    }

    //굳이 super를 쓰지 않아도 된다.
    //super 사용하지 않고 구현한다.

    public double area() {
        return getDistance(1,0);
    }
}
