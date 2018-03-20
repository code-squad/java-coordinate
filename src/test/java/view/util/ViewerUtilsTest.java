package view.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViewerUtilsTest {

    @Test
    public void 소수점_포맷팅() {
        assertEquals("3.245", ViewerUtils.formatDistance(3.24523125412321312));
    }
}