package coordinate.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import coordinate.domain.Point;
import coordinate.domain.Triangle;

public class TriangleTest {

	private ArrayList<Point> points;

	@Before
	public void setUp() {
		points = new ArrayList<>();
		points.add(Point.of("1,5"));
		points.add(Point.of("4,2"));
		points.add(Point.of("5,3"));
	}

	@Test
	public void testGetArea() {
		assertThat(String.format("%.1f", Triangle.getArea(points)), is("3.0"));
	}

	@Test
	public void testIsTriangle() {
		Triangle triangle = Triangle.of(points);
		assertThat(triangle.isTriangle(), is(true));
		points.set(0, Point.of("1,1"));
		points.set(1, Point.of("2,1"));
		points.set(2, Point.of("3,1"));
		triangle = Triangle.of(points);
		assertThat(triangle.isTriangle(), is(false));

	}
}
