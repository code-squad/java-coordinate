package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Figures {

    // static block 클래스에 List<Points>를 넣으려고 많은 과정을 거치며 클래스 변수는
    // 클래스 메소드에 들어갈 수 없다는 것을 알게 되었다.
    // static 메솓를 넣으려고 할 때, java.lang.ExceptionInInitializerError에가 나오는 것을 명심하자!
//    private static List<Point> points;
    private static Map<Integer, AbstractFigures> map = new HashMap<>();

    // static block 클래스를 사용 될 때 한번만 호출하는 것
//    static {
//    List<Point> point = Parser.makePoints();
//        map.put(2, new Line(point));
//        map.put(4, new Rectangle(point));
//}

    public Figures() {
    }

    public double select(int size) {
        List<Point> point = Parser.makePoints();
        map.put(2, new Line(point));
        map.put(3, new Triangle(point));
        map.put(4, new Rectangle(point));
        return map.get(size).getValue();
    }
}
