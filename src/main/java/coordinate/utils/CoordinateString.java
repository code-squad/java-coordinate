package coordinate.utils;

public class CoordinateString {
    private String coordinateString;

    public CoordinateString(int num) {
        this.coordinateString = makeAxis(num);
    }

    public CoordinateString() {
        this.coordinateString = makePlaneBlank();
    }

    public static String makeAxis(int i) {
        if (i == 0) {
            return "  0 ";
        }
        if (i % 2 == 0) {
            return String.format("%3d", i);
        }
        return "   ";
    }

    public static String makePlaneBlank() {
        return String.format("%3s", " ");
    }

    public void toMarking() {
            this.coordinateString = String.format("%3s", "*");
    }

    @Override
    public String toString() {
        return coordinateString;
    }
}
