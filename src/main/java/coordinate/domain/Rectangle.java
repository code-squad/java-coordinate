package coordinate.domain;

import coordinate.util.InputException;

import java.util.List;

public class Rectangle extends FigureAbstract {

    public Rectangle(List<Point> points) throws InputException {
        super(points);
        checkRectangle();
    }

    public void checkRectangle() throws InputException{
        if (!(isSameXLine() && isSameYLine())) {
            throw new InputException("직사각형이 아닙니다.다시 입력해주세요.");
        }
    }

    private boolean isSameXLine() {
        return getPoint(0).isSameXCoordinate(getPoint(1))
                && getPoint(2).isSameXCoordinate(getPoint(3));
    }

    private boolean isSameYLine() {
        return getPoint(0).isSameYCoordinate(getPoint(2))
                && getPoint(1).isSameYCoordinate(getPoint(3));
    }

    @Override
    public double getArea() {
        return getPoint(0).getDistance(getPoint(1))
                * getPoint(0).getDistance(getPoint(2));
    }

    @Override
    public String getMessage() {
        return "의 넓이는 ";
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    int size() {
        return 4;
    }
}
