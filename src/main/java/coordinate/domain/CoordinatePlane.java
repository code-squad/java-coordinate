package coordinate.domain;

import coordinate.util.StringUtil;
import coordinate.view.InputView;

import java.util.ArrayList;
import java.util.Collections;

public class CoordinatePlane {
    public static final int MAX = 25;
    private final int size;
    private ArrayList<Coordinate> coordinates;

    public CoordinatePlane() {
        this.size = MAX;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Coordinate> enterCoordinates(String input) {
        String[] inputs = StringUtil.splitStringByDash(input);
        coordinates = new ArrayList<>();

        try {
            for (String s : inputs) {
                String[] coordinate = StringUtil.splitStringByComma
                        (StringUtil.removeParentheses(s));
                coordinates.add(Coordinate.of(coordinate[0], coordinate[1]));
            }
        } catch (Exception e) {
            System.out.println("좌표 입력 범위 초과 (0 ~ 24)");
            enterCoordinates(InputView.getPoint());
        }

        Collections.sort(coordinates);
        return coordinates;
    }
}
