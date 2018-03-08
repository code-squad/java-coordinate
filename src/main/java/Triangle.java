import java.util.List;

public class Triangle extends Figure {

    public Triangle (List<String> points) {
        super(points);
    }

    @Override
    public double distanceA(List<Point> values) {
        return super.distanceA(values);
    }

    @Override
    public double distanceB(List<Point> values) {
        return super.distanceB(values);
    }

    @Override
    public double distanceC(List<Point> values) {
        return super.distanceC(values);
    }

    public double area() {
        double s = (super.distanceA(values) + super.distanceB(values) + super.distanceC(values)) / 2;
        double result = Math.pow(s * (s - super.distanceA(values)) * (s - super.distanceB(values)) * (s - super.distanceC(values)), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
