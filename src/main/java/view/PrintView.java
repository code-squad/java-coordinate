package view;

public class PrintView {
    private static StringBuilder stringBuilder = new StringBuilder();
    public static final int COORDINATE = 24;

    public static void printAll() {
        printCoordinate();
        System.out.println(String.valueOf(stringBuilder));
    }

    public static void printCoordinate() {
        printBarY();
        stringBuilder.append(String.format("%3s", "┼"));
        printBarX();
    }

    private static void printBarX() {
        for (int i = 0; i < COORDINATE; i++) {
            printRow();
        }
        stringBuilder.append("\n");
        for (int j = 0; j <= COORDINATE; j += 2) {
            stringBuilder.append(String.format("%2d", j));
            stringBuilder.append(String.format("%6s", " "));
        }
    }

    private static void printBarY() {
        for (int i = COORDINATE; i > 0; i -= 2) {
            stringBuilder.append(String.format("%2d", i));
            printHeight();
            stringBuilder.append("\n");
        }
    }

    public static void printRow() {
        for (int i = 0; i < 2; i++) {
            stringBuilder.append("─");
        }
    }

    public static void printHeight() {
        stringBuilder.append("┃");
        stringBuilder.append("\n");
        stringBuilder.append(String.format("%3s", "┃"));
    }
}
