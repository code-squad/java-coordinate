package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Square implements Figure {
    @Override
    public double area(List<Point> points) {
        if (!checkRectangle(points)) {
            throw new IllegalArgumentException();
        }

        List<Double> linesLength = new ArrayList<>();
        Point criteria = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            linesLength.add(criteria.calculateLength(points.get(i)));
        }

        /*  직사각형이라면 특정 한 점에서 나머지 점까지 거리 중 대각선이 제일 길다  */
        Collections.sort(linesLength);

        return linesLength.get(0) * linesLength.get(1);
    }

    /*  4개 Point의 중점(평균) 좌표로부터 각 Point까지 거리가 모두 같을 때 직사각형(정사각형)이라 전제  */
    public static boolean checkRectangle(List<Point> points) {
        Point middlePoint = Point.calculatePointsAverage(points);
        double criteria = middlePoint.calculateLength(points.get(0));

        for (int i = 1; i < points.size(); i++) {
            if (criteria != middlePoint.calculateLength(points.get(i))) return false;
        }
        return true;
    }
}
