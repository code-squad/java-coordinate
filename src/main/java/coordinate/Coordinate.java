package coordinate;

import coordinate.domain.PointNumCheck;
import coordinate.view.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> points = UserInput.getPoints(scanner);
        int numOfPoints = points.size();

        PointNumCheck pointNumCheck = new PointNumCheck();
        pointNumCheck.resultByPointNum(numOfPoints, points);
    }
}
