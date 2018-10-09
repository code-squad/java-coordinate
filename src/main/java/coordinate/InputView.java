package coordinate;

import java.util.*;

public class InputView {
    private static StringTokenizer STZ;

    public static String inputPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return scan.next();
    }

    public static List<Integer> extractNum(String beforeToken) {
        List<Integer> numbers = new ArrayList<>();
        STZ = new StringTokenizer(beforeToken, "\\(|\\)|,|-");
        while (STZ.hasMoreElements()) {
            numbers.add(stringToInt(STZ.nextToken()));
        }
        return numbers;
    }

    public static int stringToInt(String stringObject) {
        return Integer.parseInt(stringObject);
    }
}
