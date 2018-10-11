package domain;

import util.PointException;

import java.util.*;

public class Rectangle extends Figure {
    protected Rectangle() {
        /* 테스트 용도 */
    }

    public Rectangle(List<Point> points) throws PointException {
        this.points = points;
        Collections.sort(points);
        if(!isComputable()) {
            throw new PointException("네점이 뒤뜰어진 형태의 사각형입니다.");
        }
    }

    @Override
    protected boolean isComputable() throws PointException {
        /* 직사각형 확인 --> (조건 : 직사각형 세로 모두 평행을 이루고, 길이가 같아야만 직사각형) */
        return isSameZeroGradient() && isSameLength();
    }

    protected boolean isSameZeroGradient() {
        /* 테스트를 위해 protected 기울기가 0이면 수직이고, 사각형의 세로 직선이 수직이면 평행 */
        return points.get(0).getGradient(points.get(1)) == 0 && points.get(2).getGradient(points.get(3)) == 0;
    }

    protected boolean isSameLength() throws PointException {
        return getLineLength(makeSubList(0, 2)) == getLineLength(makeSubList(2, 4));
    }

    protected double getLineLength(List<Point> subPoints) throws PointException {
        return new Line(subPoints).evaluate();
    }

    private List<Point> makeSubList(int start, int end) {
        return points.subList(start, end);
    }

    @Override
    public double evaluate() throws PointException {
        /* 이처럼 0 2 숫자를 직접 입력하는 부분도 하드코딩인가요? */
        return getLineLength(makeSubList(0, 2)) * getLineLength(makeSubList(2, 4));
    }

    @Override
    public String stringFormat() throws PointException {
        return String.format("사각형의 넓이는 : %d", evaluate());
    }
}

