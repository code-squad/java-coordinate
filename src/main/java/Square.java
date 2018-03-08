
import java.util.List;

public class Square extends Figure {
    public Square(List<String> points) {
        super(points);
    }

    public int width() {
        return Math.abs(super.values.get(0).xValue() - super.values.get(1).xValue());
    }

    public int height() {
        return Math.abs(super.values.get(3).yValue() - super.values.get(2).yValue());
    }

    public double area() {
        return width() * height();
    }
}
