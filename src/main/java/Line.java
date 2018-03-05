import java.util.List;

public class Line {
    private Point point1;
    private Point point2;

    public Line(List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
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


}
