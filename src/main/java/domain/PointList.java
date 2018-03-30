package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PointList {
    private List<Point> points;

    public PointList(List<String> numbers) throws Exception {
        if (!isProperSizeOfArray(numbers)) {
            throw new Exception("정상적인 좌표 값을 입력해주세요.");
        }
        points = makePoints(numbers);
    }

    public List<Point> getPoints() {
        return points;
    }

    private List<Point> makePoints(List<String> numbers) throws Exception {
        // 질문 - 미리 선언할 때 초기화해서 points생성시 clear() VS new를 통해 재할당
        points = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i = i + 2) {
            // Pobi's advice
            Point point = Point.getPoint(numbers.get(i), numbers.get(i + 1));
            isOverlap(points, point);
            points.add(point);
        }
        sortDesc();
        return points;
    }

    private Boolean isOverlap(List<Point> points, Point point) throws Exception {
        if (points.contains(point)) {
            throw new Exception("위치가 같은 점(point)이 존재합니다. 점들의 위치는 서로 달라야 합니다.");
        }
        return false;
    }

    // Boolean VS boolean : Boolean은 null을 반환할 수 있다. 그럴거면 optional을 쓰던가?
    private Boolean isProperSizeOfArray(List<String> numbers) {
        return numbers.size() > 1;
    }

    private void sortDesc() {
        Collections.sort(points, descSort);
    }

    // 이 comparator의 위치는 point와 pointList중 어디가 적절한가
    private Comparator<Point> descSort = new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            Integer o1Y = o1.getY();
            Integer o2Y = o2.getY();
            int compareResult = o1Y.compareTo(o2Y);

            if (compareResult != 0) {
                return compareResult * -1; // 기본값에 -1을 곱하면 descending
            }

            Integer o1X = o1.getX();
            Integer o2X = o2.getX();
            compareResult = o1X.compareTo(o2X);
            return compareResult;
        }
    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb.append(point.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
