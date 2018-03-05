import java.util.List;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle (List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
    }

    public double distanceA(){
        int xDistance = point1.xValue() - point2.xValue();
        int yDistance = point1.yValue() - point2.yValue();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double distanceB(){
        int xDistance = point2.xValue() - point3.xValue();
        int yDistance = point2.yValue() - point3.yValue();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double distanceC(){
        int xDistance = point3.xValue() - point1.xValue();
        int yDistance = point3.yValue() - point1.yValue();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double area(){
        double s = (distanceA() + distanceB() + distanceC()) / 2;
        double result = Math.pow(s * (s - distanceA()) * (s - distanceB()) * (s - distanceC()), 0.5);
        return Math.round((result * 100d) / 100d);

    }

}
