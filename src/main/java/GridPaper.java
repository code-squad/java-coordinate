public class GridPaper {
    private static final String BLANK = " ";
    private static final String PLUS = "+";
    private static final String DASH = "-";
    private static final String LETTER_O = "O";
    private int offset;
    private StringBuilder stringBuilder;
    private int size;

    public GridPaper(int size) {
        this.size = size;
        offset = digitOf(size) + 1;
        stringBuilder = new StringBuilder();
    }

    private int digitOf(int size) {
        return String.valueOf(size).length();
    }

    public void draw(){
        drawAxisOfY();
        drawAxisOfX(size);
        drawNumberOfXAxis();
    }

    private void drawAxisOfY() {
        for (int i = size; i >= 1; i--) {
            drawNumberOfYAxis(i);
        }
    }

    private void drawNumberOfYAxis(int y) {
        stringBuilder.append(String.format("%" + offset + "d|", y));
        stringBuilder.append(System.lineSeparator());
    }

    private void drawAxisOfX(int size) {
        repeatLetter(BLANK, offset);
        stringBuilder.append(PLUS);
        repeatLetter(DASH, offset * size);
        stringBuilder.append(System.lineSeparator());
    }

    private void drawNumberOfXAxis() {
        repeatLetter(BLANK, offset);
        stringBuilder.append(LETTER_O);
        for (int i = 1; i <= size; i++) {
            stringBuilder.append(String.format("%" + offset + "d", i));
        }
    }

    private void repeatLetter(String value, int time) {
        for (int i = 0; i < time; i++) {
            stringBuilder.append(value);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
