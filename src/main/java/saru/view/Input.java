package saru.view;

import static saru.view.Output.MAX_VALUE;

import saru.domain.*;

import java.util.*;

public class Input {
    private static final String INPUT_USER_INPUT = "좌표를 입력하세요.";
    private static final String INPUT_RANGE_ERROR = "범위가 잘못 되었습니다. 다시 입력하세요";
    private static final int FIRST_INDEX = 1;
    private static final int SECOND_INDEX = 2;
    private static final int LINE_POINT_COUNT = 2;
    private static final String REGEX = "[\\(,\\)]";

    private Scanner scanner = new Scanner(System.in);

    public List<Point> getUserInput() {
        // 유저에게 텍스트 입력 받는다
        List<Point> points;

        do {
            System.out.println();

            System.out.println(INPUT_USER_INPUT);
            String userInputString = scanner.nextLine();
            points = getSplitedUserInputString(userInputString);
        } while (!checkPointRange(points));

        return points;
    }

    public boolean checkPointRange(List<Point> points) {
        int checkedNum = 0;

        for (Point point : points) {
            checkedNum += checkXYRange(point.getX(), point.getY());
        }

        if (checkedNum != 0) {
            System.out.println(INPUT_RANGE_ERROR);
            return false;
        }
        return true;
    }

    private int checkXYRange(double x, double y) {
        if (x < 0 || x > MAX_VALUE) {
            return 1;
        }

        if (y < 0 || y > MAX_VALUE) {
            return 1;
        }

        return 0;
    }

    private void assignmentSplitString(List<Point> points, String[] pointSplitArr) {
        // 첫 문자가 구분자라서 0번 인덱스는 ""(empty string)
        points.add(new Point(Double.parseDouble(pointSplitArr[FIRST_INDEX]),
                Double.parseDouble(pointSplitArr[SECOND_INDEX]),
                true));
    }

    public List<Point> getSplitedUserInputString(String userInputString) {
        String[] lineSplitArr = userInputString.split("-");
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < LINE_POINT_COUNT; i++) {
            String pointSplitArr[] = lineSplitArr[i].split(REGEX);
            assignmentSplitString(points, pointSplitArr);
        }

        return points;
    }
}
