package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class InputUtilTest {

    @Test
    public void coordInBoundaryCheck_ordinal(){
        List<String> coordinates = Arrays.asList("0,5", "15,24");
        assertThat(InputUtil.coordInBoundaryCheck(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void coordInBoundaryCheck_exception(){
        List<String> coordinates = Arrays.asList("2,25", "3,2");
        InputUtil.coordInBoundaryCheck(coordinates);
    }

    @Test
    public void eachCoorMaxCheck_ordinal(){
        assertThat(InputUtil.eachCoordInBoundaryCheck(5), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void eachCoorMaxCheck_upperLimitException(){
        InputUtil.eachCoordInBoundaryCheck(25);
    }

    @Test(expected = RuntimeException.class)
    public void eachCoorMaxCheck_lowerLimitException(){
        InputUtil.eachCoordInBoundaryCheck(-1);
    }

    @Test
    public void inputParser(){
        List<String> coordinates = Arrays.asList("1,2", "3,4");
        assertThat(InputUtil.inputParser("(1,2)-(3,4)"), is(coordinates));
    }

    @Test
    public void duplicatedCheck_ordinal(){
        List<String> coordinates = Arrays.asList("1,2", "1,3");
        assertThat(InputUtil.duplicatedCheck(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void duplicatedCheck_exception(){
        List<String> coordinates = Arrays.asList("1,2", "1,2");
        InputUtil.duplicatedCheck(coordinates);
    }

    @Test
    public void isValidCoordinate_ordinal(){
        List<String> coordinates = Arrays.asList("0,5", "15,24");
        assertThat(InputUtil.isValidCoordinate(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void isValidCoordinate_upperLimitException(){
        List<String> coordinates = Arrays.asList("1,2", "1,25");
        InputUtil.isValidCoordinate(coordinates);
    }

    @Test(expected = RuntimeException.class)
    public void isValidCoordinate_lowerLimitException(){
        List<String> coordinates = Arrays.asList("0,1", "1,-1");
        InputUtil.isValidCoordinate(coordinates);
    }

    @Test
    public void checkReturnCoordinates_ordinal(){
        List<String> coordinates = Arrays.asList("0,1", "3,4");
        assertThat(InputUtil.checkReturnCoordinates("(0,1)-(3,4)"), is(coordinates));
    }

    @Test(expected = RuntimeException.class)
    public void checkReturnCoordinates_upperLimitException(){
        InputUtil.checkReturnCoordinates("(0,1)-(3,25)");
    }

    @Test(expected = RuntimeException.class)
    public void checkReturnCoordinates_lowerLimitException(){
        InputUtil.checkReturnCoordinates("(0,1)-(3,-1)");
    }


}
