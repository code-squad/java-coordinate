package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
// static block 클래스에 List<Points>를 넣으려고 많은 과정을 거치며 클래스 변수는
// 클래스 메소드에 들어갈 수 없다는 것을 알게 되었다.
// static 메솓를 넣으려고 할 때, java.lang.ExceptionInInitializerError에가 나오는 것을 명심하자!

public class Figures {

    private static List<Point> points;
    private static Map<Integer, AbstractFigures> map = new HashMap<>();

    public Figures(List<Point> points) {
        this.points = points;
    }

    public AbstractFigures select(int size) {
        map.put(2, new Line(points));
        map.put(3, new Triangle(points));
        map.put(4, new Rectangle(points));
        return map.get(size);
    }
}
