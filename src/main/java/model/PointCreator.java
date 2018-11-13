package model;

public class PointCreator {

    public static Point position(String string) {
        String[] list = string.split(",");
        return new Point(Integer.parseInt(list[0]), Integer.parseInt(list[1]));
    }

}
