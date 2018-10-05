package coordinate;

public class MyString {
    private String displayString;

    public MyString(int num) {
        this.displayString = makeString(num);
    }

    public MyString() {
        this.displayString = makeString();
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
        this.displayString = String.format("%3s", "*");
    }

    @Override
    public String toString() {
        return displayString;
    }
}
