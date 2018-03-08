import java.util.List;

public class Triangle extends Figure {

    public Triangle (List<String> points){
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

//    private double distanceA(){ return point1.disance(point2); }
//
//    private double distanceB(){
//        return point2.disance(point3);
//    }
//
//    private double distanceC(){ return point3.disance(point1); }

    public double area(){
//        double s = (distanceA() + distanceB() + distanceC()) / 2;
        double s = (super.distanceA(values) + super.distanceB(values) + super.distanceC(values)) / 2;
//        double result = Math.pow(s * (s - distanceA()) * (s - distanceB()) * (s - distanceC()), 0.5);
        double result = Math.pow(s * (s - super.distanceA(values)) * (s - super.distanceB(values)) * (s - super.distanceC(values)), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
