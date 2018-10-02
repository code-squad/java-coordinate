package coordinate;

import java.util.List;

public class BoundaryChecker {
    public static boolean isValid(String[] coordinate){
        boolean answer = true;
        for (String position : coordinate) {
            answer &= isValidPosition(position);
        }
        return answer;
    }

    public static boolean isValidPosition(String position){
        List<Integer> positionXY = PointFactory.makeRefinedXY(position);
        boolean answer = true;
        for (Integer value : positionXY) {
            answer &= boundaryCheck(value);
        }
        return answer;
    }

    public static boolean boundaryCheck(int number){
        return number <= CoordinateFactory.MAX_POSITION;
    }
}
