package view;

public class ResultView {
    static final int MAX = 24;

    public static void printCoordinates() {
        for (int i = MAX; i > 0; i--) {
            printYAxis(i);
        }
        printXAxis();
    }

    private static void printXAxis() {
        System.out.print("  " + "+");
        for (int i = 0; i < MAX; i++) {
            System.out.print(String.format("%2s", "--"));
        }
        System.out.print("\n" + String.format("%-3s", "0"));
        for (int i = 1; i < 13; i++) {
            System.out.print(String.format("%4s", i * 2));
        }
    }

    private static int printYAxis(int index) {
        if (index % 2 == 0) {
            System.out.println(String.format("%-2s" + "|", index));
            return index;
        }
        System.out.println(String.format("%-2s" + "|", "  "));
        return index;
    }
}