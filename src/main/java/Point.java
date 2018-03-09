import java.util.Arrays;
import java.util.List;

public class Point {
    private int x, y;

    public Point(String points){
        String info = points.substring(1 , points.length()-1);
        List<String> xyDivide = Arrays.asList(info.split(","));
        x = Integer.parseInt(xyDivide.get(0));
        y = Integer.parseInt(xyDivide.get(1));
    }

    public Integer xValue(){
        return x;
    }

    public Integer yValue(){
        return y;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Point){
            Point point = (Point) obj;
            return (x == point.x) && (y == point.y);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        int result = this.x + this.y;
        return result;
    }
}
