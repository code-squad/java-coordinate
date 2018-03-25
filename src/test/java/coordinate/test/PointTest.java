package coordinate.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import coordinate.domain.Point;

public class PointTest {

	Point point;

	@Before
	public void setUp() {
		point = Point.of("1,2");
	}

	@Test
	public void testDrawPoint() {
		assertThat(point.drawPoint(2, 0), is("*"));
		assertThat(point.drawPoint(0, ""), is("*"));
	}

	@Test
	public void testIsSameYaxis() {
		assertThat(point.isSameYaxis(2), is(true));
	}

	@Test
	public void testGetDistance() {
		Point otherPoint = Point.of("1,7");
		assertThat(point.getDistance(otherPoint), is(5.0));
	}
}
