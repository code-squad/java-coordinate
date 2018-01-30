import java.util.List;

public class Line {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Line(List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
        point4 = new Point(points.get(3));
    }

    public int xDistance(){
        return Math.abs(point2.xValue() - point1.xValue());
    }

    public int yDistance(){
        return Math.abs(point2.yValue() - point1.yValue());

    }

    public double calculateDistance(){
        return Math.sqrt(Math.pow(xDistance(), 2) + Math.pow(yDistance(), 2));
    }

    public int width(){
        return Math.abs(point3.xValue() - point4.xValue());
    }

    public int height(){
        return Math.abs(point3.yValue() - point2.yValue());
    }

    public int area(int width, int height){
        return width * height;
    }
}
