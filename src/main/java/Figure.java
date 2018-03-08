import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    List<Point> values = new ArrayList<Point>();

    Figure(List<String> points){
        // 여기서 point처리
        for (String point : points) {
            values.add(new Point(point));
        }
    }

    public double distanceA(List<Point> values){
        return Math.pow(Math.pow(values.get(0).xValue() - values.get(1).xValue(), 2) +
                Math.pow(values.get(0).yValue() - values.get(1).yValue(), 2), 0.5);
    }

    public double distanceB(List<Point> values){
        return Math.pow(Math.pow(values.get(1).xValue() - values.get(2).xValue(), 2) +
                Math.pow(values.get(1).yValue() - values.get(2).yValue(), 2), 0.5);
    }

    public double distanceC(List<Point> values){
        return Math.pow(Math.pow(values.get(2).xValue() - values.get(0).xValue(), 2) +
                Math.pow(values.get(2).yValue() - values.get(0).yValue(), 2), 0.5);
    }

    public abstract double area();

}
