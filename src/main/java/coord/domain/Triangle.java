package coord.domain;


import java.util.Arrays;
import java.util.List;

public class Triangle extends Figure {

    Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        return formulaOfHeron();
    }

    private double formulaOfHeron() {
        List<Double> sidesOfTriangle = Arrays.asList(
                getPoints().get(0).distanceTo(getPoints().get(1)),
                getPoints().get(1).distanceTo(getPoints().get(2)),
                getPoints().get(2).distanceTo(getPoints().get(0)));
        return 0.25 * Math.sqrt(
                (sidesOfTriangle.get(0) + sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (-sidesOfTriangle.get(0) + sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (sidesOfTriangle.get(0) - sidesOfTriangle.get(1) + sidesOfTriangle.get(2))
                        * (sidesOfTriangle.get(0) + sidesOfTriangle.get(1) - sidesOfTriangle.get(2)));
    }

    @Override
    public String figureKind() {
        return "삼각형";
    }
}
