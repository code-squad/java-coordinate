package coordinate;

import java.util.Scanner;

public class InputView {
    public static int inputPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("포인트를 입력해주세요");
        int result = scanner.nextInt();
        return result;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("더할래?(y,n)");
        String result = scanner.nextLine();
        return result;
    }
}
