import java.util.List;

public class Square extends Figure {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
        point4 = new Point(points.get(3));
    }

    public int width(){
        return Math.abs(point1.xValue() - point2.xValue());
    }

    public int height(){
        return Math.abs(point3.yValue() - point2.yValue());
    }

    public double area(){
        return width() * height();
    }

}
