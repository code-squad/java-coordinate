package util;

import domain.Points;

public class Calculator {

    public static final int RECTANGLE = 4;
    public static final int TRIANGLE = 3;
    public static final int LINE = 2;

    public static String calc(Points points) {
        if(points.isThis(RECTANGLE))
            return "사각형의 넓이는 " + rectangularErea(points);
        if(points.isThis(TRIANGLE))
            return null;
        if(points.isThis(LINE))
            return "두 점 사이의 거리는 " + lineLen(points);
        return "Point가 1개 혹은 4개 이상이라 계산할 수 없습니다.";
    }

    public static double lineLen(Points points) {
        return points.getDistance();
    }

    public static int rectangularErea(Points points) {
        return points.getRectangularArea();
    }

}
