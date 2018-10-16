package coordinate.view;

public class ResultView {
    private static final int MAX_SIZE_OF_COORDINATE = 24;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final String HORIZONTAL_BAR = "|";
    private static final String VERTICAL_BAR = "--";
    private static final String BLANK = " ";
    private static final String PLUS = "+";
    private static final String DOUBLE_LENGTH_FORMATTER = "%2s";
    private static final String TRIPLE_LENGTH_FORMATTER = "%3s";

    private static StringBuilder sb = new StringBuilder();

    public static void printGrpah() {
        printYAxis(MAX_SIZE_OF_COORDINATE);
        printXAxis(MAX_SIZE_OF_COORDINATE);
    }

    private static void printYAxis(int size) {
        sb.setLength(ZERO);
        for (int i = size; i > ZERO; i--) {
            sb.append(decidePrintYAxisNumber(i));
            printYAxisLine(i);
        }
        System.out.println(sb.toString());
    }

    private static void printYAxisLine(int i) {
        sb.append(HORIZONTAL_BAR);
        if (i != ONE) sb.append(System.getProperty("line.separator"));
    }

    private static String decidePrintYAxisNumber(int number) {
        if (isEven(number)) {
            return String.format(DOUBLE_LENGTH_FORMATTER, number);
        }
        return String.format(DOUBLE_LENGTH_FORMATTER, BLANK);
    }

    private static void printXAxis(int size) {
        printXAxisLine(size);
        printXAxisNumber(size);
    }

    private static void printXAxisLine(int size) {
        sb.setLength(ZERO);
        for (int i = 0; i <= size; i++) {
            sb.append(decidePrintXAxisLine(i));
        }
        System.out.println(sb.toString());
    }

    private static String decidePrintXAxisLine(int i) {
        return (i == ZERO) ? String.format(TRIPLE_LENGTH_FORMATTER, PLUS) : VERTICAL_BAR;
    }

    private static void printXAxisNumber(int size) {
        sb.setLength(ZERO);
        sb.append(String.format(TRIPLE_LENGTH_FORMATTER, ZERO + BLANK));
        for (int i = 1; i <= size; i++) {
            sb.append(decidePrintNumber(i));
        }
        System.out.println(sb.toString());
    }

    private static String decidePrintNumber(int number){
        return isEven(number) ? String.format(DOUBLE_LENGTH_FORMATTER, number) : String.format(DOUBLE_LENGTH_FORMATTER, BLANK);
    }

    private static boolean isEven(int number){
        return number % TWO == ZERO;
    }
}