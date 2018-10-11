package coordinate.domain;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Triangle extends Figure{
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    private static final String NAME = "Triangle";

    public Triangle(List<Point> points) {
        super(points);
        if(!this.isValid()) throw new IllegalArgumentException("TriangleException");
    }

    @Override
    protected boolean isValid() {
        List<Line> lines = this.generateLines();
        Collections.sort(lines);
        return lines.get(ZERO).area() + lines.get(ONE).area() > lines.get(TWO).area();
    }

    @Override
    public double area() {
        List<Double> lineLengths = this.generateSortedLineLengths();
        double s = (lineLengths.get(ZERO) + lineLengths.get(ONE) + lineLengths.get(TWO)) / TWO;
        double firstOperand = s - lineLengths.get(ZERO);
        double secondOperand = s - lineLengths.get(ONE);
        double thirdOperand = s - lineLengths.get(TWO);

        return Math.sqrt(s * firstOperand * secondOperand * thirdOperand);
    }

    @Override
    public String getName() {
        return NAME;
    }

    private List<Line> generateLines(){
        Line a = new Line(Arrays.asList(this.points.get(ZERO), this.points.get(ONE)));
        Line b = new Line(Arrays.asList(this.points.get(ZERO), this.points.get(TWO)));
        Line c = new Line(Arrays.asList(this.points.get(ONE), this.points.get(TWO)));
        return Arrays.asList(a, b, c);
    }

    private List<Double> generateSortedLineLengths(){
        List<Line> lines = this.generateLines();
        Collections.sort(lines);
        return Arrays.asList(lines.get(ZERO).area(), lines.get(ONE).area(), lines.get(TWO).area());
    }

}
