package coordinate.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import coordinate.domain.Line;
import coordinate.domain.Point;

public class LineTest {

	Line line;
	ArrayList<Point> points;

	@Before
	public void setUp() {
		points = new ArrayList<>();
		points.add(Point.of("1,2"));
		points.add(Point.of("5,2"));
		line = Line.of(points);
	}

	@Test
	public void testGetDistance() {
		assertThat(line.getDistance(), is(4.0));
	}

	@Test
	public void testIsSameXaxis() {
		assertThat(line.isSameXaxis(), is(false));
	}

	@Test
	public void testIsSameYaxis() {
		assertThat(line.isSameYaxis(), is(true));
	}
}
