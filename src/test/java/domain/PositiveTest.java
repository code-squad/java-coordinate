package domain;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PositiveTest {

    @Test
    public void getDiff(){
        Positive positive1 = new Positive(3);
        Positive positive2 = new Positive(5);
        assertThat(positive1.getDiff(positive2), is(2));
    }
}
