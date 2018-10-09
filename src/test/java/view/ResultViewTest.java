package view;

import dto.PointDto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResultViewTest {

    @Test
    public void printCoord() {
        List<PointDto> pointsDto = new ArrayList<>();
        pointsDto.add(new PointDto(10,10));
        pointsDto.add(new PointDto(14,15));
        ResultView.printCoord(pointsDto);
    }
}