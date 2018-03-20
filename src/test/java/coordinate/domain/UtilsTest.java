package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Utils.*;

public class UtilsTest {

    @Test
    public void getCoordinatesTest() {
        List<Integer[]> list = toIntegerCoordinates(new String[]{"(1,2)", "(3,4)"});
        List<Integer[]> expected = Arrays.asList(new Integer[]{1, 2}, new Integer[]{3, 4});
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void checkSetFormatNormal() {
        String[] strSet = convertToStringArray("(5,5)");
        assertArrayEquals(new String[]{"5", "5"}, strSet);
    }

    @Test
    public void convertToIntegerArrayTest() {
        String[] strSet = new String[]{"1", "2"};
        Integer[] intSet = new Integer[]{1, 2};
        assertArrayEquals(intSet, convertToIntegerArray(strSet));
    }

    @Test
    public void checkInputFormatNormal() {
        String[] expected = new String[]{"(1,2)", "(3,4)"};
        String[] actual = checkInputFormat("(1,2)-(3,4)");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void checkInputFormatSpaceInBetween() {
        String[] expected = new String[]{"(1,2)", "(3,4)"};
        String[] actual = checkInputFormat("(1,2) -(3,4)");
        assertArrayEquals(expected, actual);
    }
}