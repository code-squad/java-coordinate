package coordinate.domain;

import java.util.List;

public class Line {

    //각각의 포인트 값을 가지고 있고 포인트에게 x,y값을 구분하라고 명령시킴
    //라인의 길이 반환

    //각 Line의 Point 값은 매번 달라질 수 있기 때문에 static으로 구현하지 말고 인스턴스 변수로 구현하는 것이 낫지 않을까?
    //여러 번 사용시 instance를 사용하는 것이 맞는 것 같습니다.
    private Point point1;
    private Point point2;

    //List에 Point로
    public Line(List<String> points) {
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
    }

    public int xDistance() {
        return Math.abs(point2.getPointX() - point1.getPointX());
    }

    public int yDistance() {
        return Math.abs(point2.getPointY() - point1.getPointY());

    }

    public double calculateLineDistance() {
        return point1.calculateLineDistance(point2);
    }
}
