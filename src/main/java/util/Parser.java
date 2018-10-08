package util;

public class Parser {
    public static int parseInteger(String text) {
        int num = 0;
        try {
            num = Integer.parseInt(text);
        } catch (Exception e) {
            /* 정규식을 통해 검증하기 때문에 실제로는 동작을 하지 않는 부분! */
            System.out.println("좌표값에 숫자 외 다른 문자를 입력하셨습니다. 종료합니다.");
        }
        return num;
    }
}
