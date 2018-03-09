
import java.util.List;

public class Square extends Figure implements Area {
    public Square(List<String> points) {
        super(points);
    }
    public int width() {
        return (int)super.getPoint(0).disance(super.getPoint(1));
    }

    public int height() {
        return (int)super.getPoint(1).disance(super.getPoint(2));
    }

    @Override
    public double area() {
        return width() * height();
    }
}
