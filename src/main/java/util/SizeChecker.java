package util;

public class SizeChecker {

    public static final int MAXSIZE = 25; // 0~24까지

    public static Boolean pointsSizeChecker(String[] values) {
        for (String value : values) {
            if (!pointSizeChecker(value)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static Boolean pointSizeChecker(String value) {
        int[] splitValues = Parser.splitStrPoint(value);
        return numSizeChecker(splitValues[0]) && numSizeChecker(splitValues[1]);
    }

    public static Boolean numSizeChecker(int num) {
        if (num >= MAXSIZE || num < 0) {
            System.out.println("입력 범위를 초과하였습니다.");
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

}
