package domain.figure;

import domain.Line;
import domain.point.Point;
import domain.point.Points;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure {
    public static final int VALID_COORDINATE_NUM = 3;

    Triangle(Points pointRepo) {
        super(pointRepo);
    }

    @Override
    public double calcArea() {
        List<Point> points = super.getPoints();
        ArrayList<Double> sidesLength = getSidesLength(points);
        double requiredValue = sidesLength.stream().mapToDouble(i -> i).sum() / 2;
        return Math.sqrt(getInCalcValue(requiredValue, sidesLength));
    }

    private double getInCalcValue(double requiredValue, ArrayList<Double> sidesLength) {
        double value = 1;
        for (double sideLength : sidesLength) {
            value *= requiredValue - sideLength;
        }
        return requiredValue * value;
    }

    private ArrayList<Double> getSidesLength(List<Point> points) {
        ArrayList<Double> sidesLength = new ArrayList<>();
        int aPointPos = 0;
        int bPointPos = aPointPos + 1;
        while (!isFinishGetSideLength(sidesLength)) {
            if (isOverPositionIdx(bPointPos)) {
                aPointPos++;
                bPointPos = aPointPos + 1;
            }
            sidesLength.add(getOneSideLength(points, aPointPos, bPointPos++));
        }
        return sidesLength;
    }

    private double getOneSideLength(List<Point> points, int aPointPos, int bPointPos) {
        return calcSideLength(points, aPointPos, bPointPos);
    }

    private boolean isFinishGetSideLength(ArrayList<Double> sidesLength) {
        return VALID_COORDINATE_NUM == sidesLength.size();
    }

    private boolean isOverPositionIdx(int positionIdx) {
        return VALID_COORDINATE_NUM == positionIdx;
    }

    private double calcSideLength(List<Point> points, int aSideIdx, int bSideIdx) {
        Line line = new Line(points.get(aSideIdx), points.get(bSideIdx));
        return line.calcDistance();
    }

    @Override
    public String getFigureName() {
        return "삼각형";
    }
}
