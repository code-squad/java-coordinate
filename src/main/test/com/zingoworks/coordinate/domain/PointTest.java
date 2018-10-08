package com.zingoworks.coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {


    @Test
    public void 콤마기준_포인트객체생성() {
        assertThat(new Point(1,1)).isEqualTo(Point.ofCommaSeparator("1,1"));
    }

    @Test
    public void 두점사이의거리() {
        Point a = new Point(1,1);
        assertThat(a.getDistance(new Point(2,2))).isEqualTo(1.4142135623730951);

        Point b = new Point("2,2");
        assertThat(b.getDistance(a)).isEqualTo(1.4142135623730951);
    }
}