package coordinate.inputview;

import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    public static ArrayList<Point> input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌표를 입력해주세요");
        String result = scanner.nextLine();
        ArrayList<Point> points = point(result);
        return points;
    }

    // String utils 옮기는 작업을 해보자.
    private static ArrayList<Point> point(String input) {
        ArrayList<Point> points = new ArrayList<>();
        String[] divisionPoints = input.split("-");
        for (String point : divisionPoints) {
            String[] pointCoordinate = replaceString(point).split(",");
            points.add(new Point(Integer.parseInt(pointCoordinate[0]),Integer.parseInt(pointCoordinate[1])));
        }
        return points;
    }

    private static String replaceString(String point) {
        String result = point.replaceAll("\\)", "");
        result = result.replaceAll("\\(", "");
        result = result.replaceAll(" ", "");
        return result;
    }

    public static ArrayList<Point> testInput(String input) {
       return point(input);
    }

}
