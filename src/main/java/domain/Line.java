package domain;

import dto.LineDto;
import dto.PointDto;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private List<Point> line;
    private int lineNum;

    private Line(List<Point> line, int lineNum) {
        this.line = line;
        this.lineNum = lineNum;
    }

    public static Line init(int maxSize, int lineNum) {
        return new Line(makeLine(maxSize, lineNum), lineNum);
    }

    private static List<Point> makeLine(int maxSize, int lineNum) {
        List<Point> line = new ArrayList<>();
        for (int i=0; i<maxSize; i++) {
            line.add(Point.initNone(lineNum));
        }

        return line;
    }

    public void addPoint(PointDto dto) {
        this.line.set(dto.getX(), Point.init(dto));
    }

    public LineDto toDto() {
        List<PointDto> lineDto = new ArrayList<>();
        for(Point p : this.line) {
            lineDto.add(p.toDto());
        }

        return new LineDto(lineDto, this.lineNum);
    }

}
