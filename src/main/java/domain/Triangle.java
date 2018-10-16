package domain;

import util.PointException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle extends Figure {

    public Triangle(List<Point> points) throws PointException {
        super(points);
        if(!isComputable()) {
            throw new PointException("잘못된 삼각형의 형태입니다. (예 : 동일선상에 위치)");
        }
    }

    @Override
    public double area() throws PointException {
        double[] lines = getTriangleLine();
        double spaceConstant = getSumLine(lines) / 2;
        double result = spaceConstant;
        for(double num : lines) {
            result *= (spaceConstant - num);
        }
        return Math.sqrt(result);
    }

    private double getSumLine(double[] lines) {
        double sum = 0;
        for(double num : lines) {
            sum += num;
        }
        return sum;
    }

    @Override
    public boolean isComputable() {
        /* 동일 선상에 위치하는지를 확인해야함 */
        return getPoint(0).getGradient(getPoint(1)) != getPoint(1).getGradient(getPoint(2));
    }

    private double[] getTriangleLine() throws PointException {
        double[] lines = {
          getLineLength(getPoint(0), getPoint(1)),
          getLineLength(getPoint(1), getPoint(2)),
          getLineLength(getPoint(2), getPoint(0))
        };
        return lines;
    }
}
