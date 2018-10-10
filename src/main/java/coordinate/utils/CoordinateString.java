package coordinate.utils;

public class CoordinateString {
    private String coordinateString;

    public CoordinateString(int num) {
        this.coordinateString = makeString(num);
    }

    public CoordinateString() {
        this.coordinateString = makeString();
    }

    public static String makeString(int i) {
        if (i == 0) {
            return "  0 ";
        }
        if (i % 2 == 0) {
            return String.format("%3d", i);
        }
        return "   ";
    }

    public static String makeString() {
        return String.format("%3s", " ");
    }

    public void toStar() {
        if (true) {
            this.coordinateString = String.format("%3s", "*");
        }
    }

    @Override
    public String toString() {
        return coordinateString;
    }
}
