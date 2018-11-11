package coordinate.domain;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CoordinateTest {
    Coordinate coordinate;

    @Before
    public void setUp() {
        coordinate = Coordinate.of();
    }

    @Test
    public void makeCoordinateTest() {
        ArrayList<String> coordinates = new ArrayList<>();
        coordinates.add("10,11");
        coordinates.add("14,15");

        coordinate.makeCoordinate(coordinates);

        assertThat(coordinate.getCoordinate().size()).isEqualTo(2);
    }

    @Test
    public void runTest() {
        String input = "(3,4)-(5,6)";

        coordinate.run(input);

        assertThat(coordinate.getPoint(0).getX()).isEqualTo(3);
        assertThat(coordinate.getPoint(0).getY()).isEqualTo(4);
        assertThat(coordinate.getPoint(1).getX()).isEqualTo(5);
        assertThat(coordinate.getPoint(1).getY()).isEqualTo(6);
    }
}
