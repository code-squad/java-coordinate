package coordinate.view;

import coordinate.dto.CoordinateResult;
import coordinate.dto.PointDto;

// print point on coordinate.
public class CoordinateHandler {
    private static final String POINT_SYMBOL = "*";
    private static final int SIZE_OF_LINE = 52;
    private static final int MAX_POSITION = 24;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static void showPoint(StringBuilder sb, CoordinateResult result){
        for (PointDto pointDto : result.getPoints()) {
            insertPoint(sb, pointDto);
        }
        System.out.println(sb.toString());
    }

    private static void insertPoint(StringBuilder sb, PointDto pointDto){
        int location = calculatePointLocation(pointDto);
        deletePlaceHolder(sb, location);
        sb.insert(location, POINT_SYMBOL);
    }

    private static void deletePlaceHolder(StringBuilder sb, int location){
        sb.delete(location, location + ONE);
    }

    private static int calculatePointLocation(PointDto pointDto){
        int x = calculateLocationX(pointDto.getPositionX());
        int y = calculateLocationY(pointDto.getPositionY());
        return x + y;
    }

    private static int calculateLocationX(int positionX) {
        if(isZero(positionX)){
            return TWO;
        }
        return positionX * TWO + ONE;
    }

    private static int calculateLocationY(int positionY) {
        return (MAX_POSITION - positionY) * SIZE_OF_LINE;
    }

    private static boolean isZero(int number){
        return number == ZERO;
    }
}
