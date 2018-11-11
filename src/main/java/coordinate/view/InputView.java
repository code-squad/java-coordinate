package coordinate.view;

import java.util.Scanner;

public class InputView {

    public static String inputPoint() {
        Scanner s = new Scanner(System.in);

        System.out.println("좌표를 입력하세요.");
        return s.next();
    }
}
