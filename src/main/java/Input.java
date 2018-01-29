import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static void firstInput() {
        System.out.println("좌표를 입력하세요.");
    }
    static ArrayList<Integer> xPoints = new ArrayList<>();
    static ArrayList<Integer> yPoints = new ArrayList<>();

     public static String pointSet(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }

    public static List<String> pointInput(String pointSet){
        List<String> points = Arrays.asList(pointSet.split("-"));
        return points;
    }

    public static ArrayList<String> pointDivide(List<String> points){
        ArrayList<String> pointDivde = new ArrayList();
        for(int i = 0; i < points.size(); i++){
            String info = points.get(i).substring(1,6);
            xyDivide(info);
        }
        return pointDivde;
    }

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
