package com.zingoworks.coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {
    @Test
    public void create_of() {
        assertThat(new Point(1,1)).isEqualTo(Point.of(1,1));
    }

    @Test
    public void create_ofCommaSeparator() {
        assertThat(new Point(1,1)).isEqualTo(Point.ofCommaSeparator("1,1"));
    }

    @Test
    public void get_distanceOfLine() {
        Point a = new Point(1,1);
        System.out.println(a.getDistance(new Point(2,2)));

        Point b = new Point("2,2");
        System.out.println(b.getDistance(a));
    }
}