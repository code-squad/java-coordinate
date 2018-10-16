package utils;

import domain.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TextParserTest {

    @Test
    public void 괄호제거() {
        assertThat(TextParser.removeParenthesis("(10,15)")).isEqualTo("10,15");
    }

    @Test
    public void makePoint() {
        String[] valsText = {"10", "15"};
        assertThat(new Point(10, 15)).isEqualTo(TextParser.makePoint(valsText));
    }

    @Test
    public void parse() {
        //(10,10)-(14,15)
        List<Point> points = new ArrayList<>();
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));

        assertThat(points).isEqualTo(TextParser.parse("(10,10)-(14,15)"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValid() {
        List<Point> points;
        points = Arrays.asList(new Point(10, 10), new Point(10, 10), new Point(14, 15));
        TextParser.isValid(points);
    }
}