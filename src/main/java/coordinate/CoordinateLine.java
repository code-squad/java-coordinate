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
            return calculatorSquare();
        if (points.size() == 3)
            return Math.round(calculatorTriangle());
        PrintView.dotCountReWrite();
        throw new IllegalArgumentException();
    }

    private double calculatorTriangle() {
        List<Double> lengths = oneLength();
        lengths.add(points.get(1).calculatorLength(points.get(2)));
        double sLength = 0;
        double triangleLength = 1;
        for (Double length : lengths) {
            sLength += length;
        }
        sLength = sLength / 2;
        for (Double length : lengths) {
            triangleLength *= sLength - length;
        }
        return Math.sqrt(triangleLength * sLength);
    }

    public double findLength() {
        return points.get(0).calculatorLength(points.get(1));
    }


    public Boolean isSquare() {
        List<Double> lengths = oneLength();                 //직사각형의 한 길이를 구해서 리스트에 담음
        List<Double> anotherLengths = matchLengthInSquare();            //그와 동일한 길이의 직사각형의 한 길이를 구해서 리스트에 담음
        int count = 0;
        for (int i = 0; i < lengths.size(); i++) {
            if (anotherLengths.get(i).equals(anotherLengths.get(i)))
                count++;
        }
        // 세쌍의 길이가 서로 같으면 직삭각형이라고 판별한다.
        if (count == 3)
            return true;
        return false;
    }


    private List<Double> oneLength() {
        List<Double> lengths = new ArrayList<>();
        for (int i = 1; i < points.size(); ++i) {
            lengths.add(points.get(0).calculatorLength(points.get(i)));
        }
        return lengths;
    }

    private List<Double> matchLengthInSquare() {
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

    public int calculatorSquare() {
        int cube = 0;
        List<Integer> lengths = isInteger(oneLength());
        if (lengths.size() == 2)
            cube = lengths.get(0) * lengths.get(1);
        if (lengths.size() == 3) {                          //세변 모두 (대각선포함) 정수일 경우 정렬한뒤 두번째만 길이를 뽑아서 곱함
            Collections.sort(lengths);
            cube = lengths.get(0) * lengths.get(1);
        }
        return cube;
    }

    private List<Integer> isInteger(List<Double> lengths) {       //한변의 길이가 정수면 정수타입의 리스트에 담음
        List<Integer> intValues = new ArrayList<>();
        for (Double length : lengths) {
            int IntegerNum = length.intValue();
            if (IntegerNum == length)
                intValues.add(IntegerNum);
        }
        return intValues;
    }

    public List<Point> getPoints() {
        return points;
    }
}
