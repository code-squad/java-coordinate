package coordinate.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> points;

    public static ArrayList<String> getPoints(Scanner scanner) {
        System.out.println("좌표를 입력하세요.");
        points = new ArrayList<>(Arrays.asList(scanner.nextLine().split("-")));
        return points;
    }
}
