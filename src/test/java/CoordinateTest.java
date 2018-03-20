import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

import coordinate.domain.Point;

public class CoordinateTest {

	@Test
	public void isNextTrueTest() {
		Point test = new Point(0,false);
		assertThat(test.isNextTrue(1), is(true));
	}
	
	@Test
	public void ofTest() {
		Point test = new Point(0,false);
		Point test2 = test.coordinate();
		assertThat(test2, is(Point.of(1, true)));
	}
}
