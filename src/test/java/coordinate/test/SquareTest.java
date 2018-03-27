package coordinate.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Square;

public class SquareTest {
	Square square;
	ArrayList<Point> points;

	@Before
	public void setUp() {
		points = new ArrayList<>();
		points.add(Point.of("1,5"));
		points.add(Point.of("1,2"));
		points.add(Point.of("4,5"));
		points.add(Point.of("4,2"));
		square = Square.of(points);
	}

	@Test
	public void testGetArea() {
		assertThat(String.format("%.1f", square.getArea()), is("9.0"));
	}

	@Test
	public void testCalcWidth() {
		Line line = new Line(points.get(0), points.get(1));
		assertThat(square.calcWidth(0, 0), is(3.0));
		assertThat(square.calcWidth(0, 1,  0), is(3.0));
	}

	@Test
	public void testCalcHeight() {
		Line line = new Line(points.get(0), points.get(1));
		assertThat(square.calcHeight(0, 0), is(3.0));
		assertThat(square.calcHeight(line, 0), is(3.0));
	}

}
