package domain;

import dto.GraphDto;
import dto.LineDto;
import dto.PointDto;
import util.SizeChecker;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Line> graph;
    private int pointNum;

    private Graph(List<Line> graph, int pointNum) {
        this.graph = graph;
        this.pointNum = pointNum;
    }

    public static Graph init(List<PointDto> points) {
        List<Line> result = makeGraph();

        return new Graph(addPointToLine(points, result), points.size());
    }

    private static List<Line> makeGraph() {
        List<Line> graph = new ArrayList<>();

        for (int i = 0; i < SizeChecker.MAXSIZE; i++) {
            graph.add(Line.init(SizeChecker.MAXSIZE, i));
        }
        return graph;
    }

    private static List<Line> addPointToLine(List<PointDto> points, List<Line> graph) {
        for(PointDto dto : points) {
            graph.get(dto.getY()).addPoint(dto);
        }

        return graph;
    }

    public GraphDto toDto() {
        List<LineDto> graphDto = new ArrayList<>();

        for(Line line : this.graph) {
            graphDto.add(line.toDto());
        }
        return new GraphDto(graphDto);
    }

}
