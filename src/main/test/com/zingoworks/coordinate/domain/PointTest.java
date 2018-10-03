package com.zingoworks.coordinate.domain;

import com.zingoworks.coordinate.domain.Point;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {

    @Test
    public void getPoint () {
        Point point = new Point(new StringBuilder ("3,12"));
        assertThat(point.getX()).isEqualTo(3);
        assertThat(point.getY()).isEqualTo(12);
    }

    @Test
    public void verify () {
        Point point = new Point(new StringBuilder ("3,25"));
        assertThat(point.alertMaxLimit(point)).isEqualTo(true);
    }

}