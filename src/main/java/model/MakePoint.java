package model;

import java.util.ArrayList;
import java.util.List;

public class Point {

    // 인스턴스가 많아도 너무 많다.... 이걸 줄여야 되는데
    private Parser parser = new Parser();
    private ArrayList<Integer> x = new ArrayList<>();
    private ArrayList<Integer> y = new ArrayList<>();
    private String coordinate;

    public Point(String coordinate) {
        this.coordinate = coordinate;
    }

    public ArrayList<Integer> getX() {
        return x;
    }

    public ArrayList<Integer> getY() {
        return y;
    }

    public void possition() {
    List<Integer> list = parser.makePoint(coordinate);
        for (int i = 0; i < list.size(); i++) {
            putPossition(i, list.get(i));
        }
    }

    public boolean putPossition(int i, int num) {
        if (i % 2 == 0) {
            return x.add(num);
        }
        if (i % 2 == 1) {
            return y.add(num);
        }
        return false;
    }
}

