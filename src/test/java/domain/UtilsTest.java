package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class UtilsTest {

    @Test
    public void coordInBoundaryCheck_ordinal(){
        List<String> coordinates = Arrays.asList("0,5", "15,24");
        assertThat(Utils.coordInBoundaryCheck(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void coordInBoundaryCheck_exception(){
        List<String> coordinates = Arrays.asList("2,25", "3,2");
        Utils.coordInBoundaryCheck(coordinates);
    }

    @Test
    public void eachCoorMaxCheck_ordinal(){
        assertThat(Utils.eachCoordInBoundaryCheck(5), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void eachCoorMaxCheck_upperLimitException(){
        Utils.eachCoordInBoundaryCheck(25);
    }

    @Test(expected = RuntimeException.class)
    public void eachCoorMaxCheck_lowerLimitException(){
        Utils.eachCoordInBoundaryCheck(-1);
    }

    @Test
    public void inputParser(){
        List<String> coordinates = Arrays.asList("1,2", "3,4");
        assertThat(Utils.inputParser("(1,2)-(3,4)"), is(coordinates));
    }

    @Test
    public void duplicatedCheck_ordinal(){
        List<String> coordinates = Arrays.asList("1,2", "1,3");
        assertThat(Utils.duplicatedCheck(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void duplicatedCheck_exception(){
        List<String> coordinates = Arrays.asList("1,2", "1,2");
        Utils.duplicatedCheck(coordinates);
    }

    @Test
    public void isValidCoordinate_ordinal(){
        List<String> coordinates = Arrays.asList("0,5", "15,24");
        assertThat(Utils.isValidCoordinate(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void isValidCoordinate_upperLimitException(){
        List<String> coordinates = Arrays.asList("1,2", "1,25");
        Utils.isValidCoordinate(coordinates);
    }

    @Test(expected = RuntimeException.class)
    public void isValidCoordinate_lowerLimitException(){
        List<String> coordinates = Arrays.asList("0,1", "1,-1");
        Utils.isValidCoordinate(coordinates);
    }

    @Test
    public void checkReturnCoordinates_ordinal(){
        List<String> coordinates = Arrays.asList("0,1", "3,4");
        assertThat(Utils.checkReturnCoordinates("(0,1)-(3,4)"), is(coordinates));
    }

    @Test(expected = RuntimeException.class)
    public void checkReturnCoordinates_upperLimitException(){
        Utils.checkReturnCoordinates("(0,1)-(3,25)");
    }

    @Test(expected = RuntimeException.class)
    public void checkReturnCoordinates_lowerLimitException(){
        Utils.checkReturnCoordinates("(0,1)-(3,-1)");
    }

    @Test
    public void figureCheckReturn_ordinal_Rectangle(){
        List<String> coordinates = Arrays.asList("0,1", "5,1", "0,3", "5,3");
        assertThat(Utils.figureCheckReturn(coordinates), is(coordinates));
    }

    @Test
    public void figureCheckReturn_ordinal_Line(){
        List<String> coordinates = Arrays.asList("0,1", "5,1");
        assertThat(Utils.figureCheckReturn(coordinates), is(coordinates));
    }

}
