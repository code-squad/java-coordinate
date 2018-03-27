import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

import coordinate.domain.CoordinatePoint;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Square;
import coordinate.domain.Triangle;

public class CoordinateTest {

	@Test
	public void isHighTest() {
		String testNum1 = "10,12";
		String testNum2 = "7,20";
		Point test = Point.of(testNum1);
		Point test2 = Point.of(testNum2);

		assertThat(test.getHeight(test2), is(8));
		assertThat(test.getWidth(test2), is(3));
	}

	@Test
	public void lineLengthTest() {
		Point test = new Point(1, 1);
		Point test2 = new Point(2, 2);
		Point test3 = new Point(3, 4);
		assertEquals(1.414, test.lineLength(test2), 0.001);
		assertEquals(3.606, test.lineLength(test3), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void pointExceptionTest() {
		Point test = new Point(25, 20);
	}

	@Test(expected = IllegalArgumentException.class)
	public void pointExceptionTest2() {
		Point test = new Point(-2, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkSamePointTest() {
		List<Point> points = Arrays.asList(new Point(5, 12), new Point(5, 12));
		CoordinatePoint.checkSamePoint(points);
	}

	@Test(expected = IllegalArgumentException.class)
	public void overInputExceptionTest() {
		String testNum = "22,2,5";
		String testNum2 = "10";
		Point test = Point.of(testNum);
		Point test2 = Point.of(testNum2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotLineTest() {
		Point test = new Point(24, 15);

		List<Point> points = new ArrayList<>();
		points.add(test);

		Line line = new Line(points);
	}

	@Test
	public void findOppositionPointTest() {
		Point test = new Point(20, 8);
		List<Point> points = Arrays.asList(new Point(2, 15), new Point(2, 8), new Point(20, 15), new Point(20, 8));

		Square square = new Square(points);
		Point testSquare = square.findOppositionPoint(points);
		assertThat(testSquare, is(test));
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkSquareExceptionTest() {
		List<Point> points = Arrays.asList(new Point(6, 7), new Point(2, 8), new Point(5, 15), new Point(20, 8));

		Square test = new Square(points);
		test.check(points);
	}

	@Test
	public void checkSquareNotExceptionTest() {
		Point test = new Point(2, 15);
		Point test2 = new Point(2, 8);
		Point test3 = new Point(20, 15);
		Point test4 = new Point(20, 8);

		List<Point> points = Arrays.asList(new Point(2, 15), new Point(2, 8), new Point(20, 15), new Point(20, 8));
		Square square = new Square(points);
		square.check(points);
	}

	@Test
	public void triangleAreaTest() {
		List<Point> points = Arrays.asList(new Point(6, 20), new Point(17, 20), new Point(15, 4));
		Triangle test = new Triangle(points);

		assertEquals(88, test.area(), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void notTriangleExceptionTest() {
		List<Point> points = Arrays.asList(new Point(17, 20), new Point(15, 4));
		Triangle test = new Triangle(points);
	}
}
