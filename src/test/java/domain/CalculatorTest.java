package domain;

import dto.PointDto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void twoPointsDistance() {
        List<PointDto> points = new ArrayList<>();

        points.add(new PointDto(1,1));
        points.add(new PointDto(5,5));

        assertEquals(5.6, Calculator.twoPointsDistance(points), 0.1);
    }

}