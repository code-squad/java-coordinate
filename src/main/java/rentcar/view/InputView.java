package rentcar.view;

import java.util.Scanner;

public class InputView {
    public static String getRentCarName() {
        System.out.println("자동차의 종류를 입력하세요 : SONATA, AVANTE, K5");
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    public static int getTripDistance() {
        System.out.println("이동할 거리를 입력하세요");
        return new Scanner(System.in).nextInt();
    }
}
