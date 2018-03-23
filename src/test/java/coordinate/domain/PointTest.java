package coordinate.domain;

import org.junit.Test;

import static coordinate.domain.Point.*;

public class PointTest {

    @Test
    public void checkDomainRangeNormal() {
        checkDomainRange(24, 24); // void
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDomainRangeExceptionOutOfDomain() {
        checkDomainRange(25, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDomainRangeExceptionOutOfRange() {
        checkDomainRange(0, 25);
    }
}