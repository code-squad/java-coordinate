import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {
    //ArrayList<Integer> xPoints = new ArrayList<>();
    //ArrayList<Integer> yPoints = new ArrayList<>();
    private int x, y;

    public static ArrayList<String> pointDivide(List<String> points){
        ArrayList<String> pointDivde = new ArrayList();
        for(int i = 0; i < points.size(); i++){
            String info = points.get(i).substring(1 , points.get(i).length()-1);
            xyDivide(info);
        }
        return pointDivde;
    }

    public static void xyDivide(String xy){
        List<String> xyDivde = Arrays.asList(xy.split(","));
        xPoints.add(Integer.parseInt(xyDivde.get(0)));
        yPoints.add(Integer.parseInt(xyDivde.get(1)));
    }
}
