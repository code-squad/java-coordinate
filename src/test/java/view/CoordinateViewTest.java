package view;

import org.junit.Test;

public class CoordinateViewTest {
    static final String VERTICAL_LINE = "│";
    static final String HORIZONTAL_LINE = "──";
    static final String CROSS = "+";
    static final String BLANK = " ";
    static final String ZERO = "0";
    static final int LENGTH = 24;
    static StringBuilder sb = new StringBuilder();

    @Test
    public void sizeTest() {
        System.out.println(VERTICAL_LINE.length());
        System.out.println(HORIZONTAL_LINE.length());
    }

    @Test
    public void drawYLineTest() {
        for (int i = LENGTH; i > 0; i--) {
            if (i % 2 != 0) {
                sb.append(String.format("%2s", BLANK) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
                continue;
            }
            sb.append(String.format("%2s", i) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
        }
        System.out.println(sb.length() / 24);
    }

    @Test
    public void sizeOfXLineTest() {
        sb.append(String.format("%2s", 0) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
        System.out.println(sb.length());
    }

    @Test
    public void stringBuilderTest() {
        StringBuilder s = new StringBuilder();
        s.append("abc");
        System.out.println(s);
        s.setCharAt(1, 'B');
        System.out.println(s);
    }

    @Test
    public void drawXLineTest() {
        sb.append(String.format("%3s", CROSS));
        for (int i = 0; i < LENGTH; i++) {
            sb.append(HORIZONTAL_LINE);
        }
        sb.append('\n');
        System.out.println(sb.length());
    }

    @Test
    public void drawXLineNumTest() {
        sb.append(String.format("%2s", ZERO) + BLANK);
        for (int i = 1; i <= LENGTH; i++) {
            if (i % 2 != 0) {
                sb.append(String.format("%2s", BLANK));
                continue;
            }
            sb.append(String.format("%2s", i));
        }
    }

    @Test
    public void drawCoordinateViewTest() {
        drawYLineTest();
        drawXLineTest();
        drawXLineNumTest();
        int e = exp(14, 23);
        System.out.println("e : " + e);
        sb.setCharAt(e, '*');
        String s = "24│                                              *";
        System.out.println(s.length());
        System.out.println(sb);
    }

    public int exp(int x, int y) {
        int answer = (24 - y) * 51 + (x * 2) + 1;
        if (x < 10) answer += 1;
        return answer;
    }
}