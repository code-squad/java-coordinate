package coordinate.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class Triangle {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;

    private List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
        if(this.isIncludeDuplication() || !this.isValidLength()) throw new IllegalArgumentException("TriangleException");
    }

    private boolean isIncludeDuplication(){
        Set<Point> newPoints = new HashSet<>();
        for (Point point : this.points) {
            newPoints.add(point);
        }
        return !(this.points.size() == newPoints.size());
    }

    private boolean isValidLength(){
        List<Line> lines = this.generateLines();
        Collections.sort(lines);
        return lines.get(ZERO).length() + lines.get(ONE).length() > lines.get(TWO).length();
    }

    private List<Line> generateLines(){
        Line a = new Line(this.points.get(ZERO), this.points.get(ONE));
        Line b = new Line(this.points.get(ZERO), this.points.get(TWO));
        Line c = new Line(this.points.get(ONE), this.points.get(TWO));
        return Arrays.asList(a, b, c);
    }

    private List<Double> generateSortedLineLengths(){
        List<Line> lines = this.generateLines();
        Collections.sort(lines);
        return Arrays.asList(lines.get(ZERO).length(), lines.get(ONE).length(), lines.get(TWO).length());
    }

    public double area(){
        List<Double> lineLengths = this.generateSortedLineLengths();
        double s = (lineLengths.get(ZERO) + lineLengths.get(ONE) + lineLengths.get(TWO)) / TWO;
        double firstOperand = s - lineLengths.get(ZERO);
        double secondOperand = s - lineLengths.get(ONE);
        double thirdOperand = s - lineLengths.get(TWO);

        return Math.sqrt(s * firstOperand * secondOperand * thirdOperand);
    }
}
