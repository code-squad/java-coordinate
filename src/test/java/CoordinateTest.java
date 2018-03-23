import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

import coordinate.domain.CoordinatePoint;
import coordinate.domain.Line;
import coordinate.domain.Point;

public class CoordinateTest {

	@Test
	public void isHighTest() {
		String testNum1 = "10,12";
		String testNum2 = "7,20";
		Point test = new Point(testNum1);
		Point test2 = new Point(testNum2);

		assertThat(test.getHeight(test2), is(8));
		assertThat(test.getWidth(test2), is(3));
	}

	@Test
	public void lineLengthTest() {
		assertEquals(1.414, Line.lineLength(1, 1), 0.001);
		assertEquals(3.606, Line.lineLength(2, 3), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void pointExceptionTest() {
		String testNum = "25,20";
		Point test = new Point(testNum);
	}

	@Test(expected = IllegalArgumentException.class)
	public void pointExceptionTest2() {
		String testNum = "-2,2";
		Point test = new Point(testNum);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkSamePointTest() {
		String testNum1 = "5,12";
		String testNum2 = "5,12";
		Point test = new Point(testNum1);
		Point test2 = new Point(testNum2);

		List<Point> points = new ArrayList<>();
		points.add(test);
		points.add(test2);
		CoordinatePoint.checkSamePoint(points);
	}

	@Test(expected = IllegalArgumentException.class)
	public void overInputExceptionTest() {
		String testNum = "22,2,5";
		String testNum2 = "10";
		Point test = new Point(testNum);
		Point test2 = new Point(testNum2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotLineTest() {
		String testNum1 = "24,15";
		Point test = new Point(testNum1);

		List<Point> points = new ArrayList<>();
		points.add(test);

		Line line = new Line(points);
	}

}
