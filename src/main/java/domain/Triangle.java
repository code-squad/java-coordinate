package domain;

import util.PointException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle extends Figure {

    public Triangle() {

    }

    public Triangle(List<Point> points) throws PointException {
        this.points = points;
        Collections.sort(points);
        if(!isComputable()) {
            throw new PointException("잘못된 삼각형의 형태입니다. (예 : 동일선상에 위치)");
        }
    }

    @Override
    public double evaluate() throws PointException {
        /*  */
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
    public String stringFormat() throws PointException {
        return String.format("삼각형의 넓이는 : %5f", evaluate());
    }

    @Override
    public boolean isComputable() {
        /* 동일 선상에 위치하는지를 확인해야함 */
        return points.get(0).getGradient(points.get(1)) != points.get(1).getGradient(points.get(2));
    }


    protected double getLineDistance(List<Point> subList) throws PointException {
        return new Line(subList).evaluate();
    }

    private List<Point> makeSubList(int i, List<Point> points) {
        if(i < points.size() - 1) {
            return points.subList(i, i + 2);
        }
        List<Point> subList = new ArrayList<>();
        subList.add(points.get(0));
        subList.add(points.get(2));
        return subList;
    }

    private double[] getTriangleLine() throws PointException {
        double[] lines = new double[points.size()];
        for(int i = 0; i < lines.length; i++) {
            lines[i] = getLineDistance(makeSubList(i, points));
        }
        return lines;
    }
}
