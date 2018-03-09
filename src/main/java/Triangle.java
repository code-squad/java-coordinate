import java.util.List;

public class Triangle extends Figure implements Area {
    Line line;
    
    public Triangle (List<String> points) {
        super(points);
        line = new Line(points);
    }

    double a = line.distance(super.getPoint(0), super.getPoint(1));
    double b = line.distance(super.getPoint(1), super.getPoint(2));
    double c = line.distance(super.getPoint(2), super.getPoint(0));

    @Override
    public double area() {
        double s = (a + b + c / 2);
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
