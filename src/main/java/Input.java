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

    public static void print(){
         for(int i = 0; i < xPoints.size(); i++){
             System.out.println("x의 " + i + "번째좌표는"+xPoints.get(i));
             System.out.println("y의 " + i + "번째좌표는"+yPoints.get(i));
         }
    }
}
