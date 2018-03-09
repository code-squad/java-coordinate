
import java.util.List;

public class Square extends Figure implements Area {
    Line line;

    public Square(List<String> points) {
        super(points);
        line = new Line(points);
    }

    public int width() {
        return (int)line.distance(super.getPoint(0), super.getPoint(1));
    }

    public int height() {
        return (int)line.distance(super.getPoint(1), super.getPoint(2));
    }

    @Override
    public double area() {
        return width() * height();
    }
}
