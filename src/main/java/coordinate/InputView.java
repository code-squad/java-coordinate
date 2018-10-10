package coordinate;

import java.util.*;

public class InputView {

    public static String inputPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return scan.next();
    }

    public static List<Integer> extractNum(String beforeToken) {
        StringTokenizer stz = new StringTokenizer(beforeToken, "\\(|\\)|,|-");
        List<Integer> numbers = new ArrayList<>();
        while (stz.hasMoreElements()) {
            numbers.add(stringToInt(stz.nextToken()));
        }
        return numbers;
    }

    public static int stringToInt(String stringObject) {
        return Integer.parseInt(stringObject);
    }
}
