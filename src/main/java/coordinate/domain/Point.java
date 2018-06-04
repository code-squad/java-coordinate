package coordinate.domain;

import java.util.HashSet;
import java.util.Objects;

public class Point {
    private final int MIN = 0;
    private final int MAX = 24;
    private int x, y;

    //굳이 List를 생성할 필요는 없겠다.
    //배열에서 바로 값을 추출해도 되지 않을까?
    //들어온 값이 변할 일이 없기 때문에 배열을 사용하는 것이 맞는거 같습니다.

    public Point(String points) {
        String info = points.substring(1, points.length() - 1);
        String[] xyDivide = info.split(",");
        if (xyDivide.length != 2) {
            throw new IllegalArgumentException();
        }
        x = Integer.parseInt(xyDivide[0]);
        y = Integer.parseInt(xyDivide[1]);
        if ( x > MAX || x < MIN || y > MAX || y < MIN) {
            throw new IllegalArgumentException("좌표의 숫자는 0 ~ 24 사이가 되어야 합니다.");
        }
    }

    public double sideLength(Point point) {
        return Math.sqrt((Math.pow(getPointX() - point.getPointX(), 2) + Math.pow(getPointY() - point.getPointY(), 2)));
    }

    public int getPointX() {
        return x;
    }

    public int getPointY() {
        return y;
    }
}