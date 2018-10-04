package com.zingoworks.coordinate.domain;

import org.junit.Test;

public class NoTest {

    @Test
    public void verifyLimit() {
        No properNo = new No(24);
        System.out.println(properNo.number);
        No nonProperNo = new No(25);
        System.out.println(nonProperNo.number);
    }

}