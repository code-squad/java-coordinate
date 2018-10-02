package domain;

import dto.LineDto;
import dto.PointDto;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void toDto() {
        List<PointDto> points = new ArrayList<>();

        points.add(new PointDto(1,2));
        points.add(new PointDto(2,3));

        Graph graph = Graph.init(points);

        for (LineDto line :graph.toDto().getGraphDto()) {
            System.out.print(line.getLineNum() + ":[");
            for(PointDto point : line.getLineDto()) {
                System.out.print(point + ",");
            }
            System.out.print("]\n");
        }
    }

}