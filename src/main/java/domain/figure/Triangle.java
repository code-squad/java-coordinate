package domain.figure;

import domain.Line;
import domain.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure {
    public static final int VALID_COORDINATE_NUM = 3;
    private List<Point> points;

    Triangle(List<Point> points) {
        if (isInvalidPointNum(points)) {
            throw new IllegalArgumentException("좌표 입력 오류(" + VALID_COORDINATE_NUM + "개 되어야함)");
        }
        this.points = points;
    }

    public static boolean isInvalidPointNum(List<Point> points) {
        return points.size() != VALID_COORDINATE_NUM;
    }

    @Override
    public double calcArea() {
        List<Double> sidesLength = getSidesLength();
        double requiredValue = sidesLength.stream().mapToDouble(i -> i).sum() / 2;
        return Math.sqrt(getInCalcValue(requiredValue, sidesLength));
    }

    private double getInCalcValue(double requiredValue, List<Double> sidesLength) {
        double value = 1;
        for (double sideLength : sidesLength) {
            value *= requiredValue - sideLength;
        }
        return requiredValue * value;
    }

    @Override
    public List<Double> getSidesLength() {
        List<Double> sidesLength = new ArrayList<>();
        int aPointPos = 0;
        int bPointPos = aPointPos + 1;
        while (!isFinishGetSideLength(sidesLength)) {
            if (isOverPositionIdx(bPointPos)) {
                aPointPos++;
                bPointPos = aPointPos + 1;
            }
            sidesLength.add(getOneSideLength(aPointPos, bPointPos++));
        }
        return sidesLength;
    }

    private double getOneSideLength(int aPointPos, int bPointPos) {
        return calcSideLength(aPointPos, bPointPos);
    }

    private boolean isFinishGetSideLength(List<Double> sidesLength) {
        return VALID_COORDINATE_NUM == sidesLength.size();
    }

    private boolean isOverPositionIdx(int positionIdx) {
        return VALID_COORDINATE_NUM == positionIdx;
    }

    private double calcSideLength(int aSideIdx, int bSideIdx) {
        Line line = new Line(points.get(aSideIdx), points.get(bSideIdx));
        return line.calcDistance();
    }

    @Override
    public String getFigureName() {
        return "삼각형";
    }
}
