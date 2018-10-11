package coord.domain;


import java.util.Arrays;
import java.util.List;

public class Triangle extends Figure {

    Triangle(List<Point> points, Point point) {
        super(points);
        points.add(point);
    }

    @Override
    public double size() {
        return formulaOfHeron();
    }

    private double formulaOfHeron() {
        List<Double> sidesOfTriangle = Arrays.asList(
                points.get(0).distanceTo(points.get(1)),
                points.get(1).distanceTo(points.get(2)),
                points.get(2).distanceTo(points.get(0)));
        return 0.25 * Math.sqrt(
                (sidesOfTriangle.get(0) + sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (-sidesOfTriangle.get(0) + sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (sidesOfTriangle.get(0) - sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (sidesOfTriangle.get(0) + sidesOfTriangle.get(1) - sidesOfTriangle.get(2)));
    }

    @Override
    public Figure addPoint(Point point) {
        return new Rectangle(this.points, point);
    }

    @Override
    public String figureKind() {
        return "삼각형";
    }
}
