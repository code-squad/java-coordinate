package coordinate;

import java.util.*;

public class CoordinateLine {
    private List<Point> points = new ArrayList<>();

    public CoordinateLine(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0)
                points.add(new Point(numbers.get(i), numbers.get(i + 1)));
        }
    }

    public double judgeDotCount() throws IllegalArgumentException {
        if (points.size() == 2)                               // 두점의 길이 혹은 네점일 경우 직사각형의 넓이 값을 출력 하도록 반환한다. 그외는 예외 발생.
            return findLength();
        if (points.size() == 4 && isSquare())
            return CalculatorSquare();
        PrintView.dotCountReWrite();
        throw new IllegalArgumentException();
    }

    public double findLength() {
        return points.get(0).calculatorLength(points.get(1));
    }


    public Boolean isSquare() {
        List<Double> lengthArr = oneLength();                 //직사각형의 한 길이를 구해서 리스트에 담음
        List<Double> anotherArr = anotherLength();            //그와 동일한 길이의 직사각형의 한 길이를 구해서 리스트에 담음
        int count = 0;
        for (int i = 0; i < lengthArr.size(); i++) {
            if (lengthArr.get(i).equals(anotherArr.get(i)))
                count++;
        }
        if (count == 3)                                       // 세쌍의 길이가 서로 같으면 직삭각형이라고 판별한다.
            return true;
        return false;
    }


    private List<Double> oneLength() {
        List<Double> lengthArr = new ArrayList<>();
        for (int i = 1; i < points.size(); ++i) {
            lengthArr.add(points.get(0).calculatorLength(points.get(i)));
        }
        return lengthArr;
    }

    private List<Double> anotherLength() {
        List<Double> lengthArr = new ArrayList<>();
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                lengthArr.add(points.get(i + 1).calculatorLength(points.get(i + 2)));
                continue;
            }
            lengthArr.add(points.get(points.size() - 1).calculatorLength(points.get(i)));
        }
        return lengthArr;
    }

    public int CalculatorSquare() {
        int cube = 0;
        List<Integer> intList = isInteger(oneLength());
        if (intList.size() == 2)
            cube = intList.get(0) * intList.get(1);
        if (intList.size() == 3) {                          //세변 모두 (대각선포함) 정수일 경우 정렬한뒤 두번째만 길이를 뽑아서 곱함
            Collections.sort(intList);
            cube = intList.get(0) * intList.get(1);
        }
        return cube;
    }

    private List<Integer> isInteger(List<Double> lengthArr) {       //한변의 길이가 정수면 정수타입의 리스트에 담음
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < lengthArr.size(); i++) {
            int IntegerNum = lengthArr.get(i).intValue();
            if (IntegerNum == lengthArr.get(i))
                intList.add(lengthArr.get(i).intValue());
        }
        return intList;
    }

    public List<Point> getPoints() {
        return points;
    }
}
