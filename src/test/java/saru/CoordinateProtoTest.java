package saru;

import org.junit.Test;
import saru.domain.*;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CoordinateProtoTest {
    @Test
    public void printZeroToTwentyFour() {
        CoordinateProto coord = new CoordinateProto();
        List<Integer> compareList = new ArrayList<>();
        for(int i = 2; i <= 24; i++) {
            if (i % 2 == 0) {
                compareList.add(i);
            }
        }

        List<Integer> genList = coord.generate(0, 24);
        assertThat(compareList, is(genList));
    }

    @Test
    public void printZeroToTwentyFourReverse() {
        CoordinateProto coord = new CoordinateProto();
        List<Integer> compareList = new ArrayList<>();
        for(int i = 24; i >= 2; i--) {
            if (i % 2 == 0) {
                compareList.add(i);
            }
        }

        List<Integer> genList = coord.generateReverse(0, 24);
        assertThat(compareList, is(genList));
    }
}
