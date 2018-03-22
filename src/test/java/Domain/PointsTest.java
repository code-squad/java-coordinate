package Domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PointsTest {

    @Test
    public void setCoordinates(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        List<String> coordinates = Arrays.asList("1,1","2,2");
        assertThat(Points.setCoordinates(coordinates), is(points));
    }

}
