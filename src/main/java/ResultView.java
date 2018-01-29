import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultView {
    static ArrayList<Integer> xPoints = new ArrayList<>();
    static ArrayList<Integer> yPoints = new ArrayList<>();

    public static void xyDivide(String xy){
        List<String> xyDivde = Arrays.asList(xy.split(","));
        xPoints.add(Integer.parseInt(xyDivde.get(0)));
        yPoints.add(Integer.parseInt(xyDivde.get(1)));
    }

    public static void distance(){
        int xDistance = xPoints.get(1) - xPoints.get(0);
        int yDistance = yPoints.get(1) - yPoints.get(0);
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        System.out.println("x의 길이 " + xDistance);
        System.out.println("y의 길이 " + yDistance);
        System.out.println("두 점 사이의 거리는 : " + distance);
    }

}
