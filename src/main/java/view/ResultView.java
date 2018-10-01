package view;

public class ResultView {

    public static void drawGraph(int size) {
        drawXLine(size);
        drawYLine(size);
    }

    public static String makeNumIndent(int i) {
        if (i % 2 == 0) {
            return numSizeIndent(i);
        }
        return "  ";
    }

    public static String numSizeIndent(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return " " + i;
    }

    public static void drawXLine(int x) {
        StringBuilder sb = new StringBuilder();

        for (int i = x; i > 0; i--) {
            sb.append(makeNumIndent(i));
            sb.append("|");
            if (i != 1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void drawYLine(int y) {
        System.out.println(OnlyYLine(y));
        System.out.println(OnlyNum(y));
    }

    public static String OnlyYLine(int y) {
        StringBuilder sb = new StringBuilder();

        sb.append("  +");
        for (int i = 0; i < y; i++) {
            sb.append("--");
        }

        return sb.toString();
    }

    public static String OnlyNum(int y) {
        StringBuilder sb = new StringBuilder();

        sb.append(" 0 ");
        for (int i = 1; i <= y; i++) {
            sb.append(makeNumIndent(i));
        }

        return sb.toString();
    }

}