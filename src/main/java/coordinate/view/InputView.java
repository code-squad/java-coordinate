package coordinate.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_COORDINATE_MESSAGE = "좌표를 입력하세요.";
    private static Scanner sc = new Scanner(System.in);

    public static String inputCoordinate() {
        System.out.println(INPUT_COORDINATE_MESSAGE);
        return sc.nextLine();
    }
}
